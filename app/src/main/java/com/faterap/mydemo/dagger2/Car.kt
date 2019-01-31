/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.dagger2
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 01/31/2019, tanminghui, Create file
 */

package com.faterap.mydemo.dagger2

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"

class Car @Inject constructor() {

    fun drive() {
        Log.i(TAG, "car is driving!")
    }
}