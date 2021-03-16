package com.huynn109.daggerbasic.component

import com.huynn109.daggerbasic.ActivityScope
import com.huynn109.daggerbasic.LoginActivity
import com.huynn109.daggerbasic.LoginPasswordFragment
import com.huynn109.daggerbasic.LoginUserFragment
import dagger.Subcomponent

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