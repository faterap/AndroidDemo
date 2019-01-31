package com.faterap.mydemo

import android.app.Activity
import android.app.Application
import android.util.Log
import com.faterap.mydemo.dagger2.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 01/31/2019, tanminghui, Create file
 */

private const val TAG = "MyApplication"

class MyApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate MyApplication")
        DaggerAppComponent.builder().application(this).build().inject(this)
    }
}