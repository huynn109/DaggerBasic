package com.huynn109.daggerbasic

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    val localDataSource: UserLocalDataSource,
    val remoteDataSource: UserRemoteDataSource
) {}

class UserLocalDataSource @Inject constructor() {
    override fun toString(): String = "UserLocalDataSource"
}

class UserRemoteDataSource @Inject constructor(val loginService: LoginService) {
    override fun toString(): String = "UserRemoteDataSource"

    fun login(): String {
        return "Login ".plus(toString())
    }
}