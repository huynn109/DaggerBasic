package com.huynn109.daggerbasic

import dagger.Component
import dagger.Module
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, SubComponentModule::class])
interface ApplicationComponent {
    fun userRepository(): UserRepository
    fun loginComponent(): LoginComponent.Factory
}

@ActivityScope
@Subcomponent
interface LoginComponent {
    // Factory that is used to create instances of this subcomponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
    fun inject(userFragment: LoginUserFragment)
    fun inject(passwordFragment: LoginPasswordFragment)
}
