package com.hdreem.clickme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Bootcamp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bootcamp)

        val clickPreviousButton = findViewById<View>(R.id.previousButton2)
        clickPreviousButton.setOnClickListener {
            val intent = Intent(this@Bootcamp, Intro::class.java)
            startActivity(intent)
        }
    }
}