package com.example.emergencyapp.data.repository

import com.example.emergencyapp.data.ErrorResponse
import com.example.emergencyapp.data.Result
import com.example.emergencyapp.data.helper.UserHelper
import com.example.emergencyapp.di.Dispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class UserRepository(
    private val userHelper: UserHelper,
    private val dispatcher: Dispatcher
) {
    fun signIn(
    ): Flow<Result<Boolean>> = flow {
        try {
            val userResponse = userHelper.signInTest()

            emit(
                Result.Success(userResponse)
            )
        } catch (exception: Exception) {
            Result.GenericError(403, ErrorResponse(exception.localizedMessage))
        }
    }.flowOn(dispatcher.providesDefaultDispatcher())
}