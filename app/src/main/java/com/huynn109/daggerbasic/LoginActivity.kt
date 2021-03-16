package com.huynn109.daggerbasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit


class LoginActivity : AppCompatActivity() {

    private lateinit var appContainer: AppContainer
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var loginUserData: LoginUserData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lastly, create an instance of LoginViewModel with userRepository
        appContainer = (application as MyApp).appContainer
        appContainer.loginContainer = LoginContainer(appContainer.userRepository).apply {
            loginViewModel = loginViewModelFactory.create()
            loginUserData = loginData
        }
    }

    override fun onDestroy() {
        appContainer.loginContainer = null
        super.onDestroy()
    }
}