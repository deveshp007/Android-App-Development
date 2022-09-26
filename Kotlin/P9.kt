package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class SimpleCalc : AppCompatActivity() {

    // Declaring TextView variables with scope as global.
    lateinit var expression: TextView
    lateinit var result: TextView

    // Declaring Button variables with scope as global.
    lateinit var btn_c: Button
    lateinit var btn_B: Button
    lateinit var btn_percent: Button
    lateinit var btn_divide: Button
    lateinit var btn_mul: Button
    lateinit var btn_sub: Button
    lateinit var btn_add: Button
    lateinit var btn_00: Button
    lateinit var btn_dot: Button
    lateinit var btn_equals: Button
    lateinit var btn_9: Button
    lateinit var btn_8: Button
    lateinit var btn_7: Button
    lateinit var btn_6: Button
    lateinit var btn_5: Button
    lateinit var btn_4: Button
    lateinit var btn_3: Button
    lateinit var btn_2: Button
    lateinit var btn_1: Button
    lateinit var btn_0: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_calc)

        // Initializing TextView variables
        expression = findViewById(R.id.expression)
        result = findViewById(R.id.result)

        // Initializing Button variables
        btn_c = findViewById(R.id.btn_C)
        btn_B = findViewById(R.id.btn_B)
        btn_percent = findViewById(R.id.btn_percent)
        btn_divide = findViewById(R.id.btn_divide)
        btn_mul = findViewById(R.id.btn_mul)
        btn_sub = findViewById(R.id.btn_sub)
        btn_add = findViewById(R.id.btn_add)
        btn_00 = findViewById(R.id.btn_00)
        btn_dot = findViewById(R.id.btn_dot)
        btn_equals = findViewById(R.id.btn_equal)

        btn_9 = findViewById(R.id.btn_9)
        btn_8 = findViewById(R.id.btn_8)
        btn_7 = findViewById(R.id.btn_7)
        btn_6 = findViewById(R.id.btn_6)
        btn_5 = findViewById(R.id.btn_5)
        btn_4 = findViewById(R.id.btn_4)
        btn_3 = findViewById(R.id.btn_3)
        btn_2 = findViewById(R.id.btn_2)
        btn_1 = findViewById(R.id.btn_1)
        btn_0 = findViewById(R.id.btn_0)



        btn_0.setOnClickListener() {
            appendText("0", true)
        }
        btn_1.setOnClickListener() {
            appendText("1", true)
        }
        btn_2.setOnClickListener() {
            appendText("2", true)
        }
        btn_3.setOnClickListener() {
            appendText("3", true)
        }
        btn_4.setOnClickListener() {
            appendText("4", true)
        }
        btn_5.setOnClickListener() {
            appendText("5", true)
        }
        btn_6.setOnClickListener() {
            appendText("6", true)
        }
        btn_7.setOnClickListener() {
            appendText("7", true)
        }
        btn_8.setOnClickListener() {
            appendText("8", true)
        }
        btn_9.setOnClickListener() {
            appendText("9", true)
        }

        btn_dot.setOnClickListener() {
            appendText(".", true)
        }
        btn_00.setOnClickListener() {
            appendText("00", true)
        }


        btn_add.setOnClickListener() {
            appendText("+", false)
        }
        btn_sub.setOnClickListener() {
            appendText("-", false)
        }
        btn_mul.setOnClickListener() {
            appendText("*", false)
        }
        btn_divide.setOnClickListener() {
            appendText("/", false)
        }
        btn_percent.setOnClickListener() {
            appendText("%", false)
        }

        btn_equals.setOnClickListener() {
            try {
                val exp = ExpressionBuilder(expression.text.toString()).build()
                val res = exp.evaluate()
                result.text = res.toString()
            } catch (e: Exception) {
                result.text = e.message
            }
        }

        btn_B.setOnClickListener() {
            result.text = ""

            val value = expression.text
            if (value.isNotEmpty()) {
                expression.text = value.substring(0, value.length - 1)
                result.hint = value.substring(0, value.length - 1)
            }
        }
        btn_c.setOnClickListener() {
            expression.text = ""
            result.text = ""
            result.hint = ""
        }

    }

    private fun appendText(value: String, toBeCleared: Boolean) {
        if (result.text != "") {
            expression.text = ""
        }

        if (toBeCleared) {
            result.text = ""
            expression.append(value)
        } else {
            expression.append(result.text)
            expression.append(value)
            result.text = ""
        }

        result.hint = expression.text

    }
}