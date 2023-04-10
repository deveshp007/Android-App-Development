package com.example.two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() , OnButtonPress, OnColorReq {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onButtonPressed(msg: String) {
        var obj = supportFragmentManager.findFragmentById(R.id.fragment_2) as FragmentTwo
        obj.onFragmentInteraction(msg)
    }


    override fun onColorRequest(code: Int){
        var c = supportFragmentManager.findFragmentById(R.id.fragment_2) as FragmentTwo
        c.onFragmentInteractionColor(code)
    }


}