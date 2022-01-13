package com.example.solidprincipledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


open class MainActivity: BaseActivity() {
    private lateinit var button_main:Button
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         button_main = findViewById(R.id.button_main)
         findViewById<TextView>(R.id.main_text).text = "main"
         button_main.setOnClickListener {
             super.startSpecificActivity(FirstActivity::class.java)
         }
        //playerview= findViewById(R.id.playerview);
    }
}