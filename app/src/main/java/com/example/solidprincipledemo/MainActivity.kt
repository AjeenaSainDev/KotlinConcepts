package com.example.solidprincipledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.exoplayer2.ui.PlayerView

open class MainActivity(val name :Int): AppCompatActivity() {
     private lateinit var   playerview: PlayerView

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playerview= findViewById(R.id.playerview);
    }
}