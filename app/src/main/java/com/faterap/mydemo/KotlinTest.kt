package com.faterap.mydemo

import android.graphics.Point
import kotlin.properties.Delegates

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 04/09/2019, tanminghui, Create file
 */

class KotlinTest {

    val test: Char by lazy { 's' }

    var name: String by Delegates.observable("<no name>") { _, old, new ->
        println("$old -> $new")
    }

    operator fun Point.rem(point: Point) {

    }

    public interface Test<out T> {
        public fun compareTo(): T
    }

    class TestClass() : Test<Number> {
        override fun compareTo(): Number {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

    }

    fun demo(x: Test<Number>): Test<Number> {
        // 1.0 类型为 Double，是 Number 的子类型
        // 因为 Comparable 只能被消费，所以可以赋值给 Comoparable<Double> 的变量
        val y = TestClass()
        return y
    }


    fun main() {
        val father = ArrayList<Father>()
        val son = ArrayList<Son>()


        father.addAll(son)
        father.add(Son())
    }

    open class Father()

    class Son() : Father() {

    }

    fun <T> fromJson(json: String, klass: Class<T>): T {
        return klass.newInstance()
    }
}