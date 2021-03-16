package com.huynn109.daggerbasic

class LoginUserData() {}
class LoginContainer(val userRepository: UserRepository) {
    val loginData = LoginUserData()
    val loginViewModelFactory = LoginViewModelFactory(userRepository = userRepository)
}