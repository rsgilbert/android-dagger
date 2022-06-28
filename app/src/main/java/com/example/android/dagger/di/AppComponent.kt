package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

// Definition of a Dagger component
@Component(modules=[StorageModule::class, AppSubcomponents::class])
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
    // Expose RegistrationComponent factory from the graph
    fun registrationComponent() : RegistrationComponent.Factory
    fun loginComponent() : LoginComponent.Factory
    fun userComponent() : UserComponent.Factory
    fun userManager(): UserManager



}