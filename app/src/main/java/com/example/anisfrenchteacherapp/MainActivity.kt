package com.example.anisfrenchteacherapp

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sayTheColor(view:View){
        var mediaPlayer = MediaPlayer.create(
            this,
           resources.getIdentifier(
               view.tag.toString(),
               "raw",
               packageName
           )
        )
        mediaPlayer.start()
    }
}