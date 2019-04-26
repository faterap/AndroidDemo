package com.faterap.mydemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // test Dagger2
//        val intent = Intent(this, TestActivity::class.java)
//        startActivity(intent)

        // test Lambda
//        Lambda.testReference()

        // test coroutine
//        Coroutine.main()

        KotlinTest().main()
    }
}
