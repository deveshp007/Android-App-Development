package com.example.three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTwo = FragmentTwo()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_2, fragmentTwo)
            .commit()

    }
}