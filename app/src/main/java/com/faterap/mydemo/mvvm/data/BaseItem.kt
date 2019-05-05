package com.faterap.mydemo.mvvm.data

import com.faterap.mydemo.BR
import com.faterap.mydemo.mvvm.adapter.BindingAdapterBase

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.mvvm.data
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 05/05/2019, tanminghui, Create file
 */
abstract class BaseItem : BindingAdapterBase.IItem {
    override fun variableId(): Int {
        return BR.item
    }
}