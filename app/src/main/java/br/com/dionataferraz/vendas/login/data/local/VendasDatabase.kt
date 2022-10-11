package br.com.dionataferraz.vendas.login.data.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.dionataferraz.vendas.App
import br.com.dionataferraz.vendas.transaction.data.local.TransactionDao
import br.com.dionataferraz.vendas.transaction.data.local.TransactionEntity

@Database(entities = [UserEntity::class, TransactionEntity::class], version = 1)
abstract class VendasDatabase : RoomDatabase() {

    abstract fun DAO(): UserDao
    abstract fun transactionDAO(): TransactionDao

    companion object {
        fun getInstance(): VendasDatabase {
            return Room.databaseBuilder(
                App.context,
                VendasDatabase::class.java,
                "vendas.db"
            ).build()
        }


    }
}