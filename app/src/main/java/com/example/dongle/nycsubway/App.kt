package com.example.dongle.nycsubway

import android.app.Application
import android.content.Context
import com.example.dongle.nycsubway.component.AppComponent
import com.example.dongle.nycsubway.component.DaggerAppComponent
import com.example.dongle.nycsubway.network.NetworkModule
import com.example.dongle.nycsubway.preference.PreferenceModule

/**
 * @author Leopold
 */
class App: Application() {

    val singleton: AppComponent by lazy {
        DaggerAppComponent.builder()
                .networkModule(NetworkModule())
                .preferenceModule(PreferenceModule())
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        fun getAppComponent(context: Context): AppComponent {
            return (context.applicationContext as App).singleton
        }
    }
}