package alpha.beta.dex_three

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class Dynamic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)

        val ll = findViewById<LinearLayout>(R.id.linerLayout)
        val b1 = findViewById<Button>(R.id.b1)

        b1.setOnClickListener {
            val b2: Button = Button(this)
            b2.text = "New Button"
            b2.setBackgroundColor(Color.MAGENTA)
            b2.setTextColor(Color.WHITE)
            b2.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(50, 48, 50, 0)
            }


            val pf: TextView = TextView(this)
            pf.text = "New Button Added!"
            pf.setTextColor(Color.WHITE)
            pf.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)

            pf.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(50, 8, 0, 0)
            }

            b2.setOnClickListener {
                Toast.makeText(this, "New Button Added!", Toast.LENGTH_LONG).show()
            }
            ll.addView(b2)
            ll.addView(pf)
        }
    }
}
