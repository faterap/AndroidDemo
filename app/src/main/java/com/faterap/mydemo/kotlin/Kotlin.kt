package com.faterap.mydemo.kotlin

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.kotlin
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 02/22/2019, tanminghui, Create file
 */class Kotlin {

    companion object {

        data class Person(val name: String, val age: Int)

        fun test() {
            val (name, age) = Person("test", 12)

            val map = mapOf(1 to "test")
            for ((key, value) in map) {
                // 使用该 key、value 做些事情
            }
        }
    }
}