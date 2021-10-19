package com.example.emergencyapp.di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class DispatcherImpl : Dispatcher {

    override fun providesDefaultDispatcher(): CoroutineDispatcher {
        return Dispatchers.Default
    }

    override fun providesIODispatcher(): CoroutineDispatcher {
        return Dispatchers.IO
    }

    override fun providesMainDispatcher(): CoroutineDispatcher {
        return Dispatchers.Main
    }
}