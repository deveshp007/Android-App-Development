package alpha.dex.dex_five

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.button)
        val rg1 = findViewById<RadioGroup>(R.id.radioGroup)
        val rb = arrayOfNulls<RadioButton>(4)
        val et1 = findViewById<EditText>(R.id.editText2)
        val et2 = findViewById<EditText>(R.id.editText3)

        rb[0] = findViewById(R.id.radioButton)
        rb[1] = findViewById(R.id.radioButton2)
        rb[2] = findViewById(R.id.radioButton3)
        rb[3] = findViewById(R.id.radioButton4)

        b1.setOnClickListener {

            val i = Intent(this, MainActivity2::class.java)
            val b = Bundle()
            val x: Int = et1.text.toString().toInt()
            val y: Int = et2.text.toString().toInt()
            when (rg1.checkedRadioButtonId) {
                R.id.radioButton -> {
                    b.putString("operation", "+")
                }
                R.id.radioButton2 -> {
                    b.putString("operation", "-")
                }
                R.id.radioButton3 -> {
                    b.putString("operation", "*")
                }
                R.id.radioButton4 -> {
                    b.putString("operation", "/")
                }
            }

            //Toast.makeText(MainActivity.this," hh"+b.getString("operation"),Toast.LENGTH_LONG).show();
            b.putInt("First", x)
            b.putInt("second", y)
            i.putExtra("info", b)
            startActivity(i)
        }
    }
}