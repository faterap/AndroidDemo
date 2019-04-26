package com.faterap.mydemo.mvvm.data

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm.data
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/26/2019, tanminghui, Create file
 */

object PigRepository {

    @WorkerThread
    fun getPigs(): LiveData<List<Pig>> {
        return MutableLiveData<List<Pig>>().apply {
            value = Pig.createTestData()
        }
    }

}