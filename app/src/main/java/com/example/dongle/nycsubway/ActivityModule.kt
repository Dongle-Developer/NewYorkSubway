package com.example.dongle.nycsubway
import android.app.Activity
import com.example.dongle.nycsubway.annotation.UserScope
import dagger.Module
import dagger.Provides

/**
 * @author Leopold
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @UserScope
    fun provideActivity() = activity
}