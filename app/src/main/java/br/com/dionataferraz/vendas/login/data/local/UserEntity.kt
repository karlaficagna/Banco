package br.com.dionataferraz.vendas.login.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Room
import br.com.dionataferraz.vendas.login.data.response.UserResponse

@Entity(tableName = "userTable")
data class UserEntity(
    val name: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val email: String,
    val password: String,
) {

}



