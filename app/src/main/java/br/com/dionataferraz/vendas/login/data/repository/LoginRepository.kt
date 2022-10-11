package br.com.dionataferraz.vendas.login.data.repository

import br.com.dionataferraz.vendas.login.data.remote.ErrorModel
import br.com.dionataferraz.vendas.login.data.remote.LoginDataSource
import br.com.dionataferraz.vendas.login.data.remote.AppResult
import br.com.dionataferraz.vendas.login.data.response.UserResponse

class LoginRepository {

    private val remoteDataSource by lazy {
        LoginDataSource()
    }

    suspend fun login(email: String, password: String): AppResult<UserResponse, ErrorModel> {
        return remoteDataSource.login(password = password, email = email)
    }
}