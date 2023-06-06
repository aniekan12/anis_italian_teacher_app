package com.example.anisfrenchteacherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val yellowButton : Button = findViewById(R.id.yellow_btn)
        yellowButton.setBackgroundColor(R.drawable.yellow_background)
    }
}