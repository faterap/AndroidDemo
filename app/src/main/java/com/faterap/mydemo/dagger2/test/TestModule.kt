package com.faterap.mydemo.dagger2.test

import com.faterap.mydemo.dagger2.scope.ActivityScope
import com.faterap.mydemo.dagger2.scope.FragmentScoped
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.dagger2.test
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 02/01/2019, tanminghui, Create file
 */

@Module
abstract class TestModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun testFragment(): TestFragment

    @ActivityScope
    @Binds
    abstract fun testPresenter(presenter: TestPresenter): TestContract.Presenter
}