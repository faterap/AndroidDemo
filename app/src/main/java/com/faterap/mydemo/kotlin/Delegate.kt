package com.faterap.mydemo.kotlin

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

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

class Delegate {

    interface Base {
        fun print()
    }

    class BaseImpl(val x: Int) : Base {
        override fun print() {
            print(x)
        }
    }

    class Derived(b: Base) : Base by b {
        override fun print() {
            println("printDerived")
        }
    }

    fun main() {
        val b = BaseImpl(10)
        Derived(b).print()
    }

    companion object {
        class Delegate {
            operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
                return "$thisRef, thank you for delegating '${property.name}' to me!"
            }

            operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
                println("$value has been assigned to '${property.name}' in $thisRef.")
            }
        }

        class Example {
            val lazyValue: String by lazy {
                println("computed!")
                "Hello"
            }

            var name: String by Delegates.observable("<no name>") { prop, old, new ->
                println("$old -> $new")
            }

            class User(private val map: Map<String, Any?>) {
                val name: String by map
                val age: Int     by map
            }

        }

        fun test() {

        }
    }
}