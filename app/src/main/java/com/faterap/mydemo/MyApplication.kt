package com.faterap.mydemo

import android.util.Log
import com.faterap.mydemo.dagger2.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

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

class MyApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate MyApplication")
    }
}