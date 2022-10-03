package alpha.beta.dex_three

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val res = findViewById<TextView>(R.id.res)
        val ress = findViewById<TextView>(R.id.ress)
        var spinner = findViewById<Spinner>(R.id.dropdown)
        val editName = findViewById<EditText>(R.id.editName)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editAdd = findViewById<EditText>(R.id.editAdd)
        val editPhone = findViewById<EditText>(R.id.editPhone)
        val btn = findViewById<Button>(R.id.btn_submit)


        var txt = intent.getStringExtra("name")

        res.text = "Please fill the following details.\n" +
                "Your ${txt} is added to cart."

        var course = arrayOf("Regular", "Medium", "Large")

        var option = ""

        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, course
            )
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    option = course[position]
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }
        }
        btn.setOnClickListener()
        {
            val t1 = editName.text.toString()
            val t3 = editEmail.text.toString()
            val t4 = editAdd.text.toString()
            val t5 = editPhone.text.toString()

            if (t1.isEmpty() ||
                t3.isEmpty() || t4.isEmpty() || t5.isEmpty()
            ) {
                ress.text = "Enter All The Values"
            } else {
                val intent = Intent(this,MainActivity3::class.java)
                intent.putExtra("name",t1)
                intent.putExtra("email",t3)
                intent.putExtra("date",t4)
                intent.putExtra("phone",t5)
                intent.putExtra("size",option)
                startActivity(intent)
            }
        }
    }
}