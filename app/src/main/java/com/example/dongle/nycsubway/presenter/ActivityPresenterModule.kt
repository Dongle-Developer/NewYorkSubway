package com.example.dongle.nycsubway.presenter

import android.app.Activity
import com.example.dongle.nycsubway.annotation.UserScope
import com.example.dongle.nycsubway.presenter.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * @author Leopold
 */
@Module
class ActivityPresenterModule {

    @Provides
    @UserScope
    fun provideMainPresenter(context: Activity): MainPresenter {
        return MainPresenter(context)
    }

}