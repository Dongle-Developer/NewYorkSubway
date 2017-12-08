package com.example.dongle.nycsubway.component

import com.example.dongle.nycsubway.FragmentModule
import com.example.dongle.nycsubway.annotation.UserScope
import com.example.dongle.nycsubway.presenter.FragmentPresenterModule
import com.example.dongle.nycsubway.ui.main.NavigationFragment
import dagger.Component

/**
 * @author Leopold
 */
@UserScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(
        FragmentPresenterModule::class,
        FragmentModule::class)
)
interface FragmentComponent  {
    fun inject(context: NavigationFragment)
}