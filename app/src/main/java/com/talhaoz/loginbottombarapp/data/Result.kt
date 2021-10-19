package com.talhaoz.loginbottombarapp.data

sealed class Result<out T> {

    data class Success<T>(val data: T) : com.talhaoz.loginbottombarapp.data.Result<T>()

    data class Loading(val loadingMessage: String? = null) : com.talhaoz.loginbottombarapp.data.Result<Nothing>()

    data class GenericError(val code: Int? = null, val error: ErrorResponse? = null) :
        com.talhaoz.loginbottombarapp.data.Result<Nothing>()

    object NetworkError : com.talhaoz.loginbottombarapp.data.Result<Nothing>()
}