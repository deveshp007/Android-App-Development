package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.constraintlayout.widget.ConstraintLayout

class ListViewEx : AppCompatActivity() {

    lateinit var lst_view: ListView
    lateinit var layoutmain: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_ex)

        lst_view = findViewById(R.id.lst_view)
        layoutmain = findViewById(R.id.layoutMain)

        val arr = arrayOf(Color.RED, Color.BLUE, Color.GRAY, Color.CYAN, Color.YELLOW)
        val b = arrayOf("RED", "BLUE", "GRAY", "CYAN", "YELLOW")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lst_view.adapter = adapter

        lst_view.setOnItemClickListener { adapterView, view, i, l ->
            layoutmain.setBackgroundColor(arr[i])
        }
    }
}