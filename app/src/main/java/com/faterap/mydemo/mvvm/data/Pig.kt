package com.faterap.mydemo.mvvm.data

import com.faterap.mydemo.R

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
data class Pig(
    val name: String,
    val color: String = "pink",
    val weight: Int = 50,
    val withGlasses: Boolean = true,
    val hoursForSleep: Int = 12
) : BaseItem() {

    override fun layoutId(): Int {
        return R.layout.pig_item_view
    }

    companion object {
        fun createTestData(): List<Pig> {
            return ArrayList<Pig>().apply {
                add(Pig("zhuzhu"))
                add(Pig("juju"))
                add(Pig("chouzhu"))
                add(Pig("chouju"))
            }
        }
    }
}