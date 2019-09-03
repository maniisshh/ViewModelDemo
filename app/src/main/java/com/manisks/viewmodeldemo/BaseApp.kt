package com.manisks.viewmodeldemo

import android.app.Application
import timber.log.Timber

/**
 * Created by user on 03-09-2019.
 */
class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}