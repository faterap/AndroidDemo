package com.faterap.mydemo.dagger2.component

import com.faterap.mydemo.dagger2.module.CarModule
import dagger.Component
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

@Singleton
@Component(modules = [CarModule::class])
interface CarComponent {
}