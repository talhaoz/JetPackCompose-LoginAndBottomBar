package com.example.emergencyapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.emergencyapp.data.Result
import com.example.emergencyapp.data.repository.UserRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    private var _loginStateResponse =
        MutableLiveData<Boolean>()
    val loginStateResponse: MutableLiveData<Boolean> get() = _loginStateResponse


    fun login() {
        viewModelScope.launch {
            userRepository.signIn().collect { response ->
                when (response) {
                    is Result.Success -> _loginStateResponse.value = response.data

                    is Result.GenericError -> { //Error
                    }
                    else -> { //Loading
                    }
                }
            }
        }
    }

}