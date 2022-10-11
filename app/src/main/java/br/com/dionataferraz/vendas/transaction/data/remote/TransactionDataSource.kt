package br.com.dionataferraz.vendas.transaction.data.remote


import android.util.Log
import br.com.dionataferraz.vendas.transaction.data.local.TransactionDao
import br.com.dionataferraz.vendas.transaction.data.local.TransactionEntity
import br.com.dionataferraz.vendas.transaction.data.local.TransactionType
import br.com.dionataferraz.vendas.login.data.local.VendasDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TransactionDataSource {
    private val dao: TransactionDao by lazy {
        VendasDatabase.getInstance().transactionDAO()
    }

    suspend fun deposit(saldoConta: Double, transactionType: TransactionType) {
        return withContext(Dispatchers.IO) {
            dao.insertTransaction(
                TransactionEntity(
                    saldoConta = saldoConta,
                    date = "",
                    transactionType = transactionType,

                )
            )
            val list = dao.getTransactions()
            Log.e("transaction", list.toString())
        }
    }
}
