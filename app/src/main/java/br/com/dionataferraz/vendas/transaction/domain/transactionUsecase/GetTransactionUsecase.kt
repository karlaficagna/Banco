package br.com.dionataferraz.vendas.transaction.domain.transactionUsecase

import br.com.dionataferraz.vendas.transaction.data.local.TransactionType
import br.com.dionataferraz.vendas.transaction.data.repository.TransactionRepository


class GetTransactionUsecase {
    private val transactionRepository by lazy {
        TransactionRepository()
    }

    suspend fun transaction(saldoConta: Double, transactionType: TransactionType) {
        transactionRepository.transaction(saldoConta = saldoConta, transactionType = transactionType)
    }
}

