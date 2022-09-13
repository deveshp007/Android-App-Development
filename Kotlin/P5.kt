package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val editName = findViewById<EditText>(R.id.editName)
        val editPass = findViewById<EditText>(R.id.editPass)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editDate = findViewById<EditText>(R.id.editDate)
        val editPhone = findViewById<EditText>(R.id.editPhone)
        val btn = findViewById<Button>(R.id.btn_submit)
        val res = findViewById<TextView>(R.id.res)

        btn.setOnClickListener() {
            val t1 = editName.text.toString()
            val t2 = editPass.text.toString()
            val t3 = editEmail.text.toString()
            val t4 = editDate.text.toString()
            val t5 = editPhone.text.toString()

            if (t1.isEmpty() || t2.isEmpty() ||
                t3.isEmpty() || t4.isEmpty() || t5.isEmpty()
            ) {
                res.text = "Enter All The Values"
            } else {
                res.text = " Entered Values are : \n " +
                        "Name : ${t1} \n" +
                        "Password : ${t2} \n" +
                        "Email : ${t3} \n" +
                        "Date : ${t4} \n" +
                        "Phone No. : ${t5} \n "
            }
        }
    }
}