package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val mul = findViewById<Button>(R.id.mul)
        val div = findViewById<Button>(R.id.div)
        val ress = findViewById<TextView>(R.id.ress)


        add.setOnClickListener() {
            val t1 = num1.text.toString()
            val t2 = num2.text.toString()
            if (t1.isEmpty() || t2.isEmpty()) {
                Toast.makeText(this, "Enter both values !!", Toast.LENGTH_SHORT).show()
            } else {
                val result = t1.toFloat() + t2.toFloat()
                ress.setText("Result :\n ${t1} + ${t2} = ${result}")
            }
        }
        sub.setOnClickListener() {
            val t1 = num1.text.toString()
            val t2 = num2.text.toString()
            if (t1.isEmpty() || t2.isEmpty()) {
                Toast.makeText(this, "Enter Both Values !!", Toast.LENGTH_SHORT).show()
            } else {
                val result = t1.toFloat() - t2.toFloat()
                ress.setText("Result :\n ${t1} - ${t2} = ${result}")
            }
        }
        mul.setOnClickListener() {
            val t1 = num1.text.toString()
            val t2 = num2.text.toString()
            if (t1.isEmpty() || t2.isEmpty()) {
                Toast.makeText(this, "Enter both values !!", Toast.LENGTH_SHORT).show()
            } else {
                val result = t1.toFloat() * t2.toFloat()
                ress.setText("Result :\n ${t1} * ${t2} = ${result}")
            }
        }
        div.setOnClickListener() {
            val t1 = num1.text.toString()
            val t2 = num2.text.toString()
            if (t1.isEmpty() || t2.isEmpty()) {
                Toast.makeText(this, "Enter both values !!", Toast.LENGTH_SHORT).show()
            } else {
                val result = t1.toFloat() / t2.toFloat()
                ress.setText("Result :\n ${t1} / ${t2} = ${result}")
            }
        }
    }
}