package com.faterap.mydemo.kotlin.coroutine

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.faterap.mydemo.R
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

/*
 * Copyright (C) 2019, TP-LINK TECHNOLOGIES CO., LTD.
 *
 * com.faterap.mydemo.kotlin.coroutine
 *
 * Description.
 *
 * Author tanminghui
 *
 * Ver 1.0, 02/27/2019, tanminghui, Create file
 */

const val TAG = "CoroutineActivity"

class CoroutineActivity : AppCompatActivity(), CoroutineScope {

    val exceptionHandler = CoroutineExceptionHandler { _, exception ->
        Log.i(TAG, "caught $exception")
    }

    var job = SupervisorJob()
    // ui thread
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    val bgDispatcher: CoroutineDispatcher = Dispatchers.IO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutine)

        testCoroutine()

//        requestDataAsync()
//        Handler().postDelayed({ stopRequest() }, 500L)
    }

    fun testCoroutine() {
        val testJob = launch {
            try {

            } finally {
            }
        }

        Handler().postDelayed({ testJob.cancel() }, 1200L)
    }

    private fun exception() {
        launch(exceptionHandler) {
            val job = launch {
                Log.i(TAG, "throw exception from launch")
                throw IndexOutOfBoundsException()
            }

            val deferred = async {
                Log.i(TAG, "throw exception from async")
                throw ArithmeticException()
            }

            try {
                deferred.await()
                Log.i(TAG, "unreachable code")
            } catch (e: ArithmeticException) {
                Log.i(TAG, "arithemeticexception caught")
            }
        }
    }

    fun startRequestSequentially() {
        requestDataSequentially()
    }

    fun stopRequest() {
        coroutineContext.cancelChildren()
    }

    fun requestDataSequentially() = launch {
        Toast.makeText(this@CoroutineActivity, "before request data", Toast.LENGTH_SHORT).show()

        Log.i(TAG, "outside async thread name: ${Thread.currentThread().name}")

        val task1 = withContext(bgDispatcher) {
            delay(2000L)
            Log.i(TAG, "async thread name: ${Thread.currentThread().name}")
            "result1"
        }

        val task2 = withContext(bgDispatcher) {
            delay(3000L)
            Log.i(TAG, "async thread name: ${Thread.currentThread().name}")
            "result2"
        }

        Toast.makeText(this@CoroutineActivity, "after request data: $task1 $task2", Toast.LENGTH_SHORT).show()
    }

    fun requestDataAsync() = launch {
        Toast.makeText(this@CoroutineActivity, "before request data", Toast.LENGTH_SHORT).show()

        Log.i(TAG, "outside async thread name: ${Thread.currentThread().name}")

        val task1 = async(bgDispatcher) {
            delay(2000L)
            Log.i(TAG, "async thread name: ${Thread.currentThread().name}")
            "result1"
        }

        val task2 = async(bgDispatcher) {
            delay(3000L)
            Log.i(TAG, "async thread name: ${Thread.currentThread().name}")
            "result2"
        }

        val result = task1.await() + ", " + task2.await()

        Toast.makeText(this@CoroutineActivity, "after request data: $result", Toast.LENGTH_SHORT).show()
    }


    fun cancelCoroutine() {
        coroutineContext.cancelChildren()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}