package com.faterap.mydemo.dagger2.module

import com.faterap.mydemo.dagger2.Car
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

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

@Module
class CarModule {
    @Singleton
    @Provides
    fun provideCar(): Car {
        return Car()
    }
}