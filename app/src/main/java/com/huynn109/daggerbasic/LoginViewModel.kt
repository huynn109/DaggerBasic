package com.huynn109.daggerbasic

import androidx.lifecycle.ViewModel
import javax.inject.Inject

@ActivityScope
class LoginViewModel @Inject constructor(val userRepository: UserRepository) : ViewModel() {
    override fun toString(): String = userRepository.remoteDataSource.toString()

    fun login() = userRepository.remoteDataSource.login()
}