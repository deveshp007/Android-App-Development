package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Lifecycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)


    }
    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle","onPause invoked")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle","onStart invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle","onStop invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle","onDestroy invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle","onResume invoked")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle","onRestart invoked")
    }
}