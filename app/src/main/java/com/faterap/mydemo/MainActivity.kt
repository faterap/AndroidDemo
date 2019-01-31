package com.faterap.mydemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.faterap.mydemo.dagger2.TestActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // test Dagger2
        val intent = Intent(this, TestActivity::class.java)
        startActivity(intent)
    }
}
