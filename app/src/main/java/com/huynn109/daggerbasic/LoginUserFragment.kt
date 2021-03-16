package com.huynn109.daggerbasic

import android.content.Context
import androidx.fragment.app.Fragment
import javax.inject.Inject

class LoginUserFragment : Fragment() {

    @Inject
    lateinit var loginViewModel: LoginViewModel
    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as LoginActivity).loginComponent.inject(this)
    }
}