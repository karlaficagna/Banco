package br.com.dionataferraz.vendas.login.data.remote

import br.com.dionataferraz.vendas.login.data.response.UserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginDataSource {private val service = RetrofitNetworkClient
    .createNetworkClient()
    .create(LoginApi::class.java)

    suspend fun login(email: String, password: String):
            AppResult<UserResponse, ErrorModel> {
        return withContext(Dispatchers.IO) {
            try {
                val user = service.login(email, password)
                AppResult.Success(user)
            } catch (exception: Exception) {
                AppResult.Error(ErrorModel)
            }
        }
    }
}

object ErrorModel

sealed class AppResult<out S, out E> {
    data class Success<S>(val value: S) : AppResult<S, Nothing>()
    data class Error<E>(val value: E) : AppResult<Nothing, E>()

    fun get(): S? {
        return when (this) {
            is Success -> value
            else -> null
        }
    }
}