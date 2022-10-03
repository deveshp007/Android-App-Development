package alpha.beta.dex_three

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val ress = findViewById<TextView>(R.id.ress)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val date = intent.getStringExtra("date")
        val phone = intent.getStringExtra("phone")
        val size = intent.getStringExtra("size")

        ress.text = "Your Entered Details : \n" +
                "Full Name : Mr. ${name} \n" +
                "Email id : ${email} \n" +
                "Address : ${date} \n" +
                "Phone no. : ${phone} \n" +
                "Size of Food : ${size}"
    }
}