package com.faterap.mydemo.dagger2.test

import android.util.Log
import com.faterap.mydemo.dagger2.scope.ActivityScope
import javax.inject.Inject

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

private const val TAG = "TestPresenter"

@ActivityScope
class TestPresenter @Inject constructor() : TestContract.Presenter {

    private var view: TestContract.View? = null

    override fun dropView() {
        this.view = null
    }

    override fun takeView(view: TestContract.View) {
        this.view = view
    }

    override fun computeTestData(): Int {
        Log.i(TAG, "computeTestData")
        return 100
    }

}