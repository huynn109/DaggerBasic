package com.huynn109.daggerbasic

import android.app.Application
import com.huynn109.daggerbasic.component.ApplicationComponent

class MyApp : Application() {

    // Create an instance of the application graph
    var applicationComponent: ApplicationComponent = DaggerApplicationComponent.create()
}