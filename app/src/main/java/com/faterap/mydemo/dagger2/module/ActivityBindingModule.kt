package com.faterap.mydemo.dagger2.module

import com.faterap.mydemo.MainActivity
import com.faterap.mydemo.dagger2.scope.ActivityScope
import com.faterap.mydemo.dagger2.test.TestActivity
import com.faterap.mydemo.dagger2.test.TestModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.dagger2.module
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 02/01/2019, tanminghui, Create file
 */

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [TestModule::class])
    abstract fun testActivity(): TestActivity

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}