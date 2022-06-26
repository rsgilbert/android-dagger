package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

// Definition of a Dagger component
@Component(modules=[StorageModule::class])
@Singleton
interface AppComponent {
    // factory to create instances of AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the context passed will
        // be available in the graph
        // With @BindsInstance for objects constructed outside the graph
        fun create(@BindsInstance context: Context) : AppComponent
    }
    // Classes that can be injected by this Component
    fun inject(registrationActivity: RegistrationActivity)
    fun inject(mainActivity: MainActivity)
    fun inject(loginActivity: LoginActivity)
    fun inject(fragment: TermsAndConditionsFragment)
}