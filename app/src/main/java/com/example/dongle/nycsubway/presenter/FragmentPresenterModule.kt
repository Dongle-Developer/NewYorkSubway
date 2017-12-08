package com.example.dongle.nycsubway.presenter

import android.support.v4.app.Fragment
import com.example.dongle.nycsubway.annotation.UserScope
import com.example.dongle.nycsubway.presenter.main.NavigationPresenter
import dagger.Module
import dagger.Provides

/**
 * @author Leopold
 */
@Module
class FragmentPresenterModule {

    @Provides
    @UserScope
    fun provideNavigationPresenter(context: Fragment): NavigationPresenter {
        return NavigationPresenter(context)
    }

}