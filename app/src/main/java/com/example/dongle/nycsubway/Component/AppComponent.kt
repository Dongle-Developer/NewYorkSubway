package com.example.dongle.nycsubway.component

import com.example.dongle.nycsubway.AppModule
import com.example.dongle.nycsubway.network.ApiModule
import com.example.dongle.nycsubway.network.NetworkModule
import com.example.dongle.nycsubway.network.api.UserApi
import com.example.dongle.nycsubway.preference.PreferenceModule
import com.example.dongle.nycsubway.preference.SettingPreference
import dagger.Component
import javax.inject.Singleton

/**
 * @author Leopold
 */
@Singleton
@Component(modules = arrayOf(
        ApiModule::class,
        AppModule::class,
        PreferenceModule::class,
        NetworkModule::class)
)
interface AppComponent {
    fun user(): UserApi
    fun setting(): SettingPreference
}