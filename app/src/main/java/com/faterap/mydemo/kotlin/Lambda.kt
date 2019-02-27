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
 */

class Lambda {

    companion object {
        class Person(val name: String, var age: Int) {
            fun present() = "I'm $name, and I'm $age years old"
            fun greet(other: String) = "Hi, $other, I'm $name"
        }

        interface TestInterface {
            fun test(a: Int): Int
        }

        inline fun innerFun(crossinline a: () -> Int) {
        }

        fun test() {
        }

        fun outterFun() {
            innerFun {
                //return  //错误，不支持直接return
                //只支持通过标签，返回innerFun
//                return
                return@innerFun 1
            }

            //如果是匿名或者具名函数，则支持
            var f = fun() {
                return
            }
        }
    }
}