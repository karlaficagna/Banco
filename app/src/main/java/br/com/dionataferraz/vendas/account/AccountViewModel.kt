package br.com.dionataferraz.vendas.account

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.dionataferraz.vendas.transaction.data.local.TransactionType
import br.com.dionataferraz.vendas.transaction.domain.transactionUsecase.GetTransactionUsecase
import kotlinx.coroutines.launch

class AccountViewModel : ViewModel() {

    private val transactionUsecase by lazy {
        GetTransactionUsecase()
    }

    fun addTransaction(saldoConta: Double) {
        viewModelScope.launch {
            transactionUsecase.transaction(
                saldoConta = saldoConta,
                transactionType = TransactionType.DEPOSIT
            )
        }
    }

    fun withdrawTransaction(saldoConta: Double) {
        viewModelScope.launch {
            transactionUsecase.transaction(
                saldoConta = saldoConta,
                transactionType = TransactionType.WITHDRAW
            )
        }
    }
}
