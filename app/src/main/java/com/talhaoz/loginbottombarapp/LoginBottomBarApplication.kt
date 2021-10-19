package com.talhaoz.loginbottombarapp

import android.app.Application
import com.talhaoz.loginbottombarapp.di.dispatcherModule
import com.talhaoz.loginbottombarapp.di.userModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class LoginBottomBarApplication : Application() {

    private val moduleList: List<Module> = listOf(
        dispatcherModule,
        userModule
    )

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@LoginBottomBarApplication)
            modules(moduleList)
        }
    }
}