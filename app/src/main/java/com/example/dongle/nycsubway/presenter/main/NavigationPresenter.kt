package com.example.dongle.nycsubway.presenter.main

import android.support.v4.app.Fragment
import com.example.dongle.nycsubway.presenter.BaseFragmentPresenter
import com.example.dongle.nycsubway.presenter.NetworkPresenterView

/**
 * @author Leopold
 */
class NavigationPresenter constructor(context: Fragment) : BaseFragmentPresenter<NavigationPresenter.View>() {
    override var view: View? = context as View

    interface View : NetworkPresenterView
}