package br.com.dionataferraz.vendas.dao

import android.accounts.Account
import br.com.dionataferraz.vendas.model.Transaction

class TransactionsDao {

    fun adiciona(transaction: Transaction) {

        transactions.add(transaction)
    }
    fun buscaTodos(): List<Transaction> {
        return transactions.toList()
    }

    companion object {
        private val transactions = mutableListOf<Account>()
    }
}


