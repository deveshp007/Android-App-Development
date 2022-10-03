package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class ImageAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_adapter)

        val ibtn1 = findViewById<ImageButton>(R.id.ibtn1)
        val ibtn2 = findViewById<ImageButton>(R.id.ibtn2)
        val ibtn3 = findViewById<ImageButton>(R.id.ibtn3)

        ibtn1.setOnClickListener() {
            Toast.makeText(this, "Image 1 Clicked", Toast.LENGTH_SHORT).show()
        }
        ibtn2.setOnClickListener() {
            Toast.makeText(this, "Image 2 Clicked", Toast.LENGTH_SHORT).show()
        }
        ibtn3.setOnClickListener() {
            Toast.makeText(this, "Image 3 Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}