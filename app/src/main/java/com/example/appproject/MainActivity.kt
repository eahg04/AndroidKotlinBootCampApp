package com.example.appproject

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.WindowDecorActionBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)


        var boxUser : EditText = findViewById(R.id.boxUser)

        val user : String = boxUser.text.toString()
    }
}