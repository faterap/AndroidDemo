package com.faterap.mydemo.mvvm

import com.faterap.mydemo.mvvm.data.Pig

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/28/2019, tanminghui, Create file
 */

interface PigProvider {
    val providerName: String
    var providerColor: String

    fun provideSinglePig(): Pig {
        return Pig(providerName)
    }

    companion object {
        class PigProviderImpl : PigProvider {
            override var providerColor: String
                get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
                set(value) {}
            override val providerName: String
                get() = "zhuzhuhui" //To change initializer of created properties use File | Settings | File Templates.
        }
    }
}