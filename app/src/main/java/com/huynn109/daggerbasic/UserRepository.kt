package com.huynn109.daggerbasic

class UserRepository(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) {}

class UserLocalDataSource() {}
class UserRemoteDataSource(private val loginService: LoginService) {}