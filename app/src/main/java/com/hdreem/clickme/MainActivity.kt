package com.hdreem.clickme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickButton = findViewById<View>(R.id.clickButton)
        clickButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Intro::class.java)
            startActivity(intent)
        }
    }
}