package com.faterap.mydemo.dagger2.component

import android.app.Application
import com.faterap.mydemo.MyApplication
import com.faterap.mydemo.dagger2.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.dagger2.component
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 01/31/2019, tanminghui, Create file
 */

@Component(modules = [AndroidInjectionModule::class, ApplicationModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

    fun inject(application: MyApplication)
}