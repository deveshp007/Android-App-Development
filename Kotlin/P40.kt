package com.example.four

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()
        val displaymode = resources.configuration.orientation
        if (displaymode == 1) {
            val f1 = FragmentOne()
            fragmentTransaction.replace(android.R.id.content, f1)
        } else {
            val f2 = FragmentTwo()
            fragmentTransaction.replace(android.R.id.content, f2)
        }
        fragmentTransaction.commit()
    }
}