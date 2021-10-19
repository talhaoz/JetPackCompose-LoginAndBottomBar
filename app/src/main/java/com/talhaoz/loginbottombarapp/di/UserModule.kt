package com.talhaoz.loginbottombarapp.di


import com.talhaoz.loginbottombarapp.data.helper.UserHelper
import com.talhaoz.loginbottombarapp.data.repository.UserRepository
import com.talhaoz.loginbottombarapp.viewmodel.UserViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val userModule = module {

    viewModel { UserViewModel(get()) }

    single { UserRepository(get(), get()) }

    single { UserHelper() }

}