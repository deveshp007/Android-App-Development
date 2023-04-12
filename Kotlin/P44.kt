package com.example.five

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timePicker = findViewById<TimePicker>(R.id.time_Picker)
        timePicker.setOnTimeChangedListener { _, hour, minute ->
            var hour = hour
            var am_pm = ""
            // AM_PM decider logic
            when {
                hour == 0 -> {
                    hour += 12
                    am_pm = "AM"
                }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> {
                    hour -= 12
                    am_pm = "PM"
                }
                else -> am_pm = "AM"
            }
            val hour1 = if (hour < 10) "0" + hour else hour
            val min = if (minute < 10) "0" + minute else minute
            // display format of time
            val msg = "Time is: $hour1 : $min $am_pm"

            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()


        }
    }
}