package com.example.dongle.nycsubway.preference

import com.example.dongle.nycsubway.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Leopold
 */
@Module
class PreferenceModule {

    @Provides
    @Singleton
    fun provideSettingPreference(app: App): SettingPreference {
        return SettingPreference(app)
    }

}