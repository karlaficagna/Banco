package br.com.dionataferraz.vendas.transaction.data.repository

import br.com.dionataferraz.vendas.transaction.data.local.TransactionType
import br.com.dionataferraz.vendas.transaction.data.remote.TransactionDataSource

class TransactionRepository {
    private val transactionDataSource by lazy {
        TransactionDataSource()
    }

    suspend fun transaction(saldoConta: Double, transactionType: TransactionType) {
        transactionDataSource.deposit(saldoConta = saldoConta, transactionType = transactionType)
    }
}
