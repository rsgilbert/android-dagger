package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class TestStorageModule {
//    @Binds
//    abstract fun provideStorage(storage: FakeStorage) : Storage

    // alternative way of providing storage
    // @Provides tells Dagger how to create instances of the type that
    // this function returns (Storage)
    // Function parameters  are the dependencies
    @Provides
    fun provideStorage(): Storage {
        // Whenever Dagger needs to provide an instance of Storage,
        // this code, the one inside @Provides method, will be run.
        return FakeStorage()
    }
}