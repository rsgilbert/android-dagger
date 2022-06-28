package com.example.android.dagger.user

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * This component lives as long as the user is logged in.
 * All the activities that can be accessed after the user is
 * logged in will be injected by this component
 */
@Subcomponent
@UserScope
interface UserComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create() : UserComponent
    }
    // Classes that can be injected by this Component
    fun inject(mainActivity: MainActivity)
    fun inject(settingsActivity: SettingsActivity)
}