package br.com.dionataferraz.vendas.transaction

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.dionataferraz.vendas.transaction.data.local.TransactionType
import br.com.dionataferraz.vendas.transaction.domain.transactionUsecase.GetTransactionUsecase
import kotlinx.coroutines.launch

class TransactionViewModel : ViewModel() {

    private val transactionUsecase by lazy {
        GetTransactionUsecase()
    }

    fun saveTransaction(saldoConta: Double) {
        viewModelScope.launch {
            transactionUsecase.transaction(
                saldoConta = saldoConta,
                transactionType = TransactionType.DEPOSIT
            )
        }

    }
}