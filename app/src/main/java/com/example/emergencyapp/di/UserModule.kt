package com.example.emergencyapp.di


import com.example.emergencyapp.data.helper.UserHelper
import com.example.emergencyapp.data.repository.UserRepository
import com.example.emergencyapp.viewmodel.UserViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userModule = module {

    viewModel { UserViewModel(get()) }

    single { UserRepository(get(), get()) }

    single { UserHelper() }

}