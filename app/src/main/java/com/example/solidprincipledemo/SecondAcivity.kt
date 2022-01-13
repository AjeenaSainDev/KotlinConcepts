package com.example.solidprincipledemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondAcivity: BaseActivity() {
    private lateinit var button_main: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_main = findViewById(R.id.button_main)
        findViewById<TextView>(R.id.main_text).text = "SecondAcivity"
        findViewById<TextView>(R.id.main_text).setOnClickListener {
            super.startSpecificActivity(SecondAcivity::class.java)
        }
        button_main.setOnClickListener {
            super.startSpecificActivity(ThirdActivity::class.java)
        }
        //playerview= findViewById(R.id.playerview);
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        println("newOnt")
    }
}