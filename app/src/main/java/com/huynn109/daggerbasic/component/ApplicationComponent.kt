package com.huynn109.daggerbasic.component

import com.huynn109.daggerbasic.module.NetworkModule
import com.huynn109.daggerbasic.module.SubComponentModule
import com.huynn109.daggerbasic.UserRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubComponentModule::class])
interface ApplicationComponent {
    fun userRepository(): UserRepository
    fun loginComponent(): LoginComponent.Factory
}

