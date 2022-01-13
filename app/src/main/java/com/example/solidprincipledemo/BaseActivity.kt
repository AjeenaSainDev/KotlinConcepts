package com.example.solidprincipledemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


abstract  class BaseActivity :AppCompatActivity() {

    open fun startSpecificActivity(otherActivityClass: Class<*>?) {
        val intent = Intent(applicationContext, otherActivityClass)
        startActivity(intent)
    }
}