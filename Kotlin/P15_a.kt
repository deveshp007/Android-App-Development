package alpha.beta.dex_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var lst_view: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var foods = arrayOf(
            "Burger 🍔",
            "Pizza 🍕",
            "Chocolate 🍫",
            "Coffee ☕",
            "Shahi Paneer 😋",
            "Cold Drink 🍷",
            "Gulab Jamun 🍨",
            "Paneer Tikka 🥘",
            "Rice Bowl 🍚",
            "Dahi Bhalle \uD83D\uDE0B",
            "Malai Kofta \uD83D\uDE0B",
            "Paneer Dosa 🍕",
            "Ice Cream 🍦"
        )

        lst_view = findViewById(R.id.lst_view)

        val adapter = ArrayAdapter(this, R.layout.card_design, R.id.mainText, foods)
        lst_view.adapter = adapter

        lst_view.setOnItemClickListener { adapterView, view, i, l ->

            var t1 = foods[i]
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", t1)
            startActivity(intent)
        }
    }
}