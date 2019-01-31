package com.faterap.mydemo.dagger2.test

import android.os.Bundle
import com.faterap.mydemo.dagger2.scope.ActivityScope
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_test.*
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

@ActivityScope
class TestFragment @Inject constructor() : DaggerFragment(), TestContract.View {

    @Inject
    lateinit var presenter: TestContract.Presenter

    override fun showTestView() {
        tv_test.text = presenter.computeTestData().toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.takeView(this)
    }

    override fun onResume() {
        super.onResume()

        showTestView()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.dropView()
    }

}