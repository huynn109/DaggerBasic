package com.huynn109.daggerbasic

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.huynn109.daggerbasic.component.LoginComponent
import javax.inject.Inject


class LoginActivity : AppCompatActivity() {

    lateinit var loginComponent: LoginComponent

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        loginComponent = (applicationContext as MyApp).applicationComponent.loginComponent().create()
        loginComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.txtContent).text =
            loginViewModel.login()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}