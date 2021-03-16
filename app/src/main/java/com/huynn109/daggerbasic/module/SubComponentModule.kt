package com.huynn109.daggerbasic.module

import com.huynn109.daggerbasic.component.LoginComponent
import dagger.Module

@Module(subcomponents = [LoginComponent::class])
class SubComponentModule {}