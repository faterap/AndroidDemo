package com.faterap.mydemo.kotlin.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.kotlin
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 02/25/2019, tanminghui, Create file
 */
class Coroutine {

    companion object {
        suspend fun requestDataSuspend() {
            suspendCoroutine<String> { continuation ->
                requestData { data ->
                    continuation.resume("test")
                }
            }
        }

        fun requestData(callback: (String) -> Unit) {
            // request data synchronously
        }

        suspend fun requestFirstData(): String {
            delay(1000L)
            return "first"
        }

        suspend fun requestSecondData(): String {
            delay(5000L)
            return "second"
        }

        fun main() = runBlocking {
            launch(coroutineContext) {
                println("Launch start: ${Thread.currentThread().name}")
                delay(1000L)
                println("Launch end: ${Thread.currentThread().name}")
            }

            coroutineScope {
                launch {
                    println("Task from nested launch")
                }

                delay(5000L)
                println("Task from coroutine scope")
            }

            run {
                println("Run start: ${Thread.currentThread().name}")
                delay(5000L)
                println("Run end: ${Thread.currentThread().name}")
            }
        }
    }
}