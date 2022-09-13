package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        val editnum1 = findViewById<EditText>(R.id.edt_num1)
        val editnum2 = findViewById<EditText>(R.id.edt_num2)
        val btn = findViewById<Button>(R.id.btn_add)
        val res = findViewById<TextView>(R.id.res)

        btn.setOnClickListener(){
            val t1 = editnum1.text.toString().toInt()
            val t2 = editnum2.text.toString().toInt()
            val result = t1 + t2
            res.text = "Result : ${result}"
        }
    }
}