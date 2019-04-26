package com.faterap.mydemo.mvvm.utils

import com.faterap.mydemo.mvvm.data.PigRepository
import com.faterap.mydemo.mvvm.viewmodel.PigListViewModelFactory

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm.utils
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/28/2019, tanminghui, Create file
 */
object FactoryInjections {

    fun providePigListViewModelFactory(): PigListViewModelFactory {
        return PigListViewModelFactory(getPigRepository())
    }

    private fun getPigRepository(): PigRepository {
        return PigRepository
    }
}