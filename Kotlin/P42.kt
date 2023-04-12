package com.example.cse225_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var customviewDrawing: CustomDrawing2
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customviewDrawing = CustomDrawing2(this)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            customviewDrawing.clearCanvas()

        }
    }
}