package com.faterap.mydemo.mvvm.viewmodel

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
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
    private val _data: MutableLiveData<List<Pig>> = PigRepository.getPigs()

    @get:Bindable
    val data: LiveData<List<Pig>> = _data

    override fun onCleared() {

    }
}