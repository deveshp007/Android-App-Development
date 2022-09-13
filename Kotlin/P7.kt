package com.example.myapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class Radio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)

        val rgrp = findViewById<RadioGroup>(R.id.rgrp)
        var submit = findViewById<Button>(R.id.submit)
        var reset = findViewById<Button>(R.id.reset)
        var out = findViewById<TextView>(R.id.out)

        submit.setOnClickListener(){
            var selectId = rgrp.checkedRadioButtonId
            if (selectId == -1){
                Toast.makeText(this,"Please select any one!!",Toast.LENGTH_SHORT).show()
            } else {
                val rB = rgrp.findViewById<RadioButton>(selectId)
                out.text = "Result : ${rB.text}"
            }
        }
        reset.setOnClickListener(){
            rgrp.clearCheck()
            out.text = ""
        }
    }
}