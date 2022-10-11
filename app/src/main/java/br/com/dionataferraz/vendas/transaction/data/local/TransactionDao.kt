package br.com.dionataferraz.vendas.transaction.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TransactionDao {
    @Insert
    fun insertTransaction(transactionEntity: TransactionEntity)

    @Delete
    fun withdrawTransaction(transactionEntity: TransactionEntity)

    @Query("SELECT * from transactionTable")
    fun getTransactions(): List<TransactionEntity>


}
