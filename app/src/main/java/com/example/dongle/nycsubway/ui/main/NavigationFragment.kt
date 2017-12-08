package com.example.dongle.nycsubway.ui.main

import android.support.v4.app.Fragment
import com.example.dongle.nycsubway.App
import com.example.dongle.nycsubway.FragmentModule
import com.example.dongle.nycsubway.R
import com.example.dongle.nycsubway.component.DaggerFragmentComponent
import com.example.dongle.nycsubway.presenter.BaseFragmentPresenter
import com.example.dongle.nycsubway.presenter.FragmentPresenterModule
import com.example.dongle.nycsubway.presenter.main.NavigationPresenter
import com.example.dongle.nycsubway.ui.PresenterFragment
import javax.inject.Inject

/**
 * @author Leopold
 */
class NavigationFragment : PresenterFragment<NavigationPresenter.View>(), NavigationPresenter.View {
    @Inject lateinit var presenter: NavigationPresenter

    override fun getPresenter(): BaseFragmentPresenter<NavigationPresenter.View>? {
        return presenter
    }

    override fun inject(fragment: Fragment) {
        DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent(fragment.context))
                .fragmentModule(FragmentModule(this))
                .fragmentPresenterModule(FragmentPresenterModule())
                .build().inject(this)
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_navigation
    }

}