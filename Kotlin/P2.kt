package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button
        btn = findViewById(R.id.btn1)

        btn.setOnClickListener(){
            Toast.makeText(this,"You are in Dex One app !!",Toast.LENGTH_LONG).show()
        }
    }
}