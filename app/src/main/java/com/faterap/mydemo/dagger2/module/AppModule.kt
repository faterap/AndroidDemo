package com.faterap.mydemo.dagger2.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.dagger2.module
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 01/31/2019, tanminghui, Create file
 */

@Module
abstract class AppModule {

    @Binds
    abstract fun bindsContext(application: Application): Context

}