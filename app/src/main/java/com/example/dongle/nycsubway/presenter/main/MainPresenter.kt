package com.example.dongle.nycsubway.presenter.main

import android.app.Activity
import com.example.dongle.nycsubway.presenter.BasePresenter
import com.example.dongle.nycsubway.presenter.NetworkPresenterView

/**
 * @author Leopold
 */
class MainPresenter constructor(context: Activity) : BasePresenter<MainPresenter.View>() {
    override var view: View? = context as View

    interface View : NetworkPresenterView
}