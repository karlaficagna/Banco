package br.com.dionataferraz.vendas.transaction.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transactionTable")
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: String,
    val saldoConta: Double,
    val transactionType: TransactionType
)

enum class TransactionType{
    DEPOSIT,
    WITHDRAW
}