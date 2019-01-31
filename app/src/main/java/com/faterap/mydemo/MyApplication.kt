package com.faterap.mydemo

import android.util.Log
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

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate MyApplication")
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }
}