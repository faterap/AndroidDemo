package com.faterap.mydemo.dagger2.component

import com.faterap.mydemo.dagger2.module.ActivityModule
import dagger.Component

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.dagger2.component
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 01/31/2019, tanminghui, Create file
 */

@Component(modules = [ActivityModule::class])
interface ActivityComponent {
}