package com.faterap.mydemo.dagger2.test

import com.faterap.mydemo.dagger2.base.BasePresenter
import com.faterap.mydemo.dagger2.base.BaseView

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

interface TestContract {

    interface View : BaseView<Presenter> {
        fun showTestView()
    }

    interface Presenter : BasePresenter<View> {
        fun computeTestData(): Int
    }
}