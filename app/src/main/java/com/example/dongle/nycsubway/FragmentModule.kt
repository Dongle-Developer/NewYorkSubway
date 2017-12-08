package com.example.dongle.nycsubway

import android.support.v4.app.Fragment
import com.example.dongle.nycsubway.annotation.UserScope
import dagger.Module
import dagger.Provides

/**
 * @author Leopold
 */
@Module
class FragmentModule(private val fragment: Fragment) {

    @Provides
    @UserScope
    fun provideFragment() = fragment
}