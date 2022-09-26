package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxEx : AppCompatActivity() {


    lateinit var btn: Button
    lateinit var pizza: CheckBox
    lateinit var chocolate: CheckBox
    lateinit var coffee: CheckBox
    lateinit var drink: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        pizza = findViewById(R.id.pizza)
        chocolate = findViewById(R.id.Chocolate)
        coffee = findViewById(R.id.Coffee)
        drink = findViewById(R.id.Drink)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener() {
            var amount: Int = 0
            var result = StringBuilder()
            result.append("Selected Items")

            if (pizza.isChecked) {
                result.append("\nPizza : ₹150")
                amount += 150
            }
            if (chocolate.isChecked) {
                result.append("\nChocolate : ₹250")
                amount += 250
            }
            if (coffee.isChecked) {
                result.append("\nCoffee : ₹50")
                amount += 50
            }
            if (drink.isChecked) {
                result.append("\nDrink : ₹150")
                amount += 150
            }
            result.append("\nTotal : ₹${amount}")
            Toast.makeText(this, result.toString(), Toast.LENGTH_LONG).show()
        }
    }
}