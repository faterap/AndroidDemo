package com.faterap.mydemo.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.faterap.mydemo.R
import com.faterap.mydemo.mvvm.data.Pig
import com.faterap.mydemo.mvvm.viewmodel.PigListViewModel
import kotlinx.android.synthetic.main.activity_mvvm.*

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/19/2019, tanminghui, Create file
 */

class MVVMActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)

        val pigViewModel = ViewModelProviders.of(this).get(PigListViewModel::class.java)
        pigViewModel.data.observe(this, Observer<List<Pig>> {
            // update UI when data changed
            rv_list.adapter
        })
    }

    private fun

}