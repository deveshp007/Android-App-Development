package com.example.cse225_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    
    lateinit var customDrawing:CustomDrawing
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customDrawing=CustomDrawing(this)
        setContentView(customDrawing)
    }
}