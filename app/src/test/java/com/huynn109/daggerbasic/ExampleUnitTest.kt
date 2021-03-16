package com.huynn109.daggerbasic

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun equal_applicationGraph(){
        val applicationGraph: ApplicationGraph = DaggerApplicationGraph.create()
        val applicationGraph2: ApplicationGraph = DaggerApplicationGraph.create()
        assert(applicationGraph != applicationGraph2)
    }

    @Test
    fun equal_userRepositorySingleton(){
        val applicationGraph: ApplicationGraph = DaggerApplicationGraph.create()
        val userRepo = applicationGraph.userRepository()
        val userRepo2 = applicationGraph.userRepository()
        assert(userRepo == userRepo2)
    }
}