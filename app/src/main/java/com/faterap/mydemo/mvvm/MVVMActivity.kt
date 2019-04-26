package com.faterap.mydemo.mvvm

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.faterap.mydemo.R
import com.faterap.mydemo.mvvm.adapter.PigAdapter
import com.faterap.mydemo.mvvm.data.Pig
import com.faterap.mydemo.mvvm.utils.FactoryInjections
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

const val TAG = "MVVMActivity"

class MVVMActivity : AppCompatActivity() {

    private val adapter = PigAdapter(this)
    lateinit var viewModel: PigListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm)

        // set list adapter
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = adapter

        viewModel = FactoryInjections.providePigListViewModelFactory().create(PigListViewModel::class.java)
        viewModel.data.value = Pig.createTestData()
        viewModel.data.observe(this, Observer<List<Pig>> {
            Log.i(TAG, "pig view model receive onChange")
            // update UI when data changed
            adapter.data = it
        })
    }
}