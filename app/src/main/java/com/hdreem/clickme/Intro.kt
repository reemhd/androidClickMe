package com.hdreem.clickme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val clickNextButton = findViewById<View>(R.id.nextButton1)
        clickNextButton.setOnClickListener {
            val intent = Intent(this@Intro, Bootcamp::class.java)
            startActivity(intent)
        }

        val clickPreviousButton = findViewById<View>(R.id.previousButton1)
        clickPreviousButton.setOnClickListener {
            val intent = Intent(this@Intro, MainActivity::class.java)
            startActivity(intent)
        }
    }
}