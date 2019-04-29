package com.faterap.mydemo.mvvm.viewmodel

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.faterap.mydemo.mvvm.data.Pig
import com.faterap.mydemo.mvvm.data.PigRepository

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm.viewmodel
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/26/2019, tanminghui, Create file
 */
class PigListViewModel : ViewModel() {
    @get:Bindable
    val data: MutableLiveData<List<Pig>> by lazy {
        PigRepository.getPigs()
    }

    override fun onCleared() {

    }
}