package com.example.dongle.nycsubway.component

import com.example.dongle.nycsubway.ActivityModule
import com.example.dongle.nycsubway.annotation.UserScope
import com.example.dongle.nycsubway.presenter.ActivityPresenterModule
import com.example.dongle.nycsubway.ui.main.MainActivity
import dagger.Component

/**
 * @author Leopold
 */
@UserScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(
        ActivityPresenterModule::class,
        ActivityModule::class)
)
interface ActivityComponent {
    fun inject(context: MainActivity)
}