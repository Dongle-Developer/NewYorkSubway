package com.example.dongle.nycsubway.ui.main

import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import com.example.dongle.nycsubway.ActivityModule
import com.example.dongle.nycsubway.App
import com.example.dongle.nycsubway.R
import com.example.dongle.nycsubway.component.DaggerActivityComponent
import com.example.dongle.nycsubway.presenter.ActivityPresenterModule
import com.example.dongle.nycsubway.presenter.BasePresenter
import com.example.dongle.nycsubway.presenter.main.MainPresenter
import com.example.dongle.nycsubway.ui.PresenterActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * @author Leopold
 */
class MainActivity : PresenterActivity<MainPresenter.View>(), MainPresenter.View {
    private lateinit var drawerToggle: ActionBarDrawerToggle
    @Inject lateinit var presenter: MainPresenter

    override fun getPresenter(): BasePresenter<MainPresenter.View>? {
        return presenter
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun inject() {
        DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent(this))
                .activityModule(ActivityModule(this))
                .activityPresenterModule(ActivityPresenterModule())
                .build().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(toolbar)

        drawerToggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.general_empty, R.string.general_empty).apply {
            syncState()
            drawer.addDrawerListener(this)
        }
    }

    override fun onDestroy() {
        drawer?.removeDrawerListener(drawerToggle)
        super.onDestroy()
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        drawerToggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return drawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item)
    }
}