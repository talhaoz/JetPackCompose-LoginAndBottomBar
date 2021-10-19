package com.example.emergencyapp.data

sealed class Result<out T> {

    data class Success<T>(val data: T) : Result<T>()

    data class Loading(val loadingMessage: String? = null) : Result<Nothing>()

    data class GenericError(val code: Int? = null, val error: ErrorResponse? = null) :
        Result<Nothing>()

    object NetworkError : Result<Nothing>()
}