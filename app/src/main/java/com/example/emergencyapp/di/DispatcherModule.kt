package com.example.emergencyapp.di

import org.koin.dsl.module

val dispatcherModule = module {
    single { DispatcherImpl() as Dispatcher }
}