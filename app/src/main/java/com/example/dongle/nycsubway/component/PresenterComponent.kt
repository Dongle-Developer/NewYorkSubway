package com.example.dongle.nycsubway.component

import com.example.dongle.nycsubway.annotation.UserScope
import com.example.dongle.nycsubway.network.ApiModule
import com.example.dongle.nycsubway.presenter.main.MainPresenter
import dagger.Component

/**
 * @author Leopold
 */
@UserScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ApiModule::class))
interface PresenterComponent{
    fun inject(presenter: MainPresenter)
}