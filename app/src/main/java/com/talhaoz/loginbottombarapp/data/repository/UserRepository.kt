package com.talhaoz.loginbottombarapp.data.repository

import com.talhaoz.loginbottombarapp.data.ErrorResponse
import com.talhaoz.loginbottombarapp.data.Result
import com.talhaoz.loginbottombarapp.data.helper.UserHelper
import com.talhaoz.loginbottombarapp.di.Dispatcher
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
            Result.GenericError(403,
                ErrorResponse(exception.localizedMessage)
            )
        }
    }.flowOn(dispatcher.providesDefaultDispatcher())
}