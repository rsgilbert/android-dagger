package com.example.android.dagger.di

import dagger.Component
import javax.inject.Singleton


// Definition of a Dagger component
@Component(modules=[TestStorageModule::class, AppSubcomponents::class])
@Singleton
interface TestAppComponent : AppComponent {
}