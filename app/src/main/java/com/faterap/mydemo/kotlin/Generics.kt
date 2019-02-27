package com.faterap.mydemo.kotlin

sealed class Person

open class Father : Person()
class Son : Father()

class Generics {

    companion object {
        fun <T> fromJson(json: String): T? {
//            val obj: T = T::class.java.newInstance()
            val obj: T? = null
            // ...
            return obj
        }

        interface TestPerson<in T : Person> {
            fun test(person: T)
        }

        fun main() {
        }

    }

}