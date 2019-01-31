package com.faterap.mydemo.dagger2.test

import android.os.Bundle
import com.faterap.mydemo.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.dagger2
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 02/01/2019, tanminghui, Create file
 */

class TestActivity : DaggerAppCompatActivity(), TestContract.View {

    @Inject
    lateinit var testPresenter: TestPresenter

    @Inject
    lateinit var testFragment: TestFragment

    override fun showTestView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        fragment ?: testFragment.let {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, it)
                    .commit()
        }
    }
}