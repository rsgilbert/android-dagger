package com.example.android.dagger

import com.example.android.dagger.login.LoginViewModel
import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.user.UserComponent
import com.example.android.dagger.user.UserManager
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

class LoginViewModelTest {
    private lateinit var viewModel: LoginViewModel
    private lateinit var userManager: UserManager

    @Before
    fun setup(){
        userManager = mock(UserManager::class.java)
        viewModel = LoginViewModel(userManager)
    }

    @Test
    fun getUsername_Gives_CorrectUsername(){
        `when`(userManager.username).thenReturn("Test Username")
        val username = viewModel.getUsername()
        assert("Test Username" == username)
    }
}