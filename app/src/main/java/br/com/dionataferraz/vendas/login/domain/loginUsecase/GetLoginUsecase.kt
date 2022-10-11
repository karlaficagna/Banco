package br.com.dionataferraz.vendas.login.domain.loginUsecase

import br.com.dionataferraz.vendas.login.data.remote.AppResult
import br.com.dionataferraz.vendas.login.data.remote.ErrorModel
import br.com.dionataferraz.vendas.login.data.repository.LoginRepository
import br.com.dionataferraz.vendas.login.data.response.UserResponse

class GetLoginUsecase {
    private val repository by lazy {
        LoginRepository()
    }

    suspend fun login(email: String, password: String):
            AppResult<UserResponse, ErrorModel> {
        return repository.login(password = password, email = email)
    }
}