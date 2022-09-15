package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val ibtn1 = findViewById<ImageButton>(R.id.ibtn1)
        val ibtn2 = findViewById<ImageButton>(R.id.ibtn2)
        val ibtn3 = findViewById<ImageButton>(R.id.ibtn3)
        val ibtn4 = findViewById<ImageButton>(R.id.ibtn4)

        ibtn1.setOnClickListener(){
            Toast.makeText(this,"Image button 1 Clicked !!!",Toast.LENGTH_SHORT).show()
        }
        ibtn2.setOnClickListener(){
            Toast.makeText(this,"Image button 2 Clicked !!!",Toast.LENGTH_SHORT).show()
        }
        ibtn3.setOnClickListener(){
            Toast.makeText(this,"Image button 3 Clicked !!!",Toast.LENGTH_SHORT).show()
        }
        ibtn4.setOnClickListener(){
            Toast.makeText(this,"Image button 4 Clicked !!!",Toast.LENGTH_SHORT).show()
        }
    }
}