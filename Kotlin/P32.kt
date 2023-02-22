package alpha.dex.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CustomToastEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast_ex)

        val btnToast = findViewById<Button>(R.id.btnToast)

        btnToast.setOnClickListener {
            val vg: ViewGroup? = findViewById(R.id.custom_toast)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.custom_toast_layout, vg)

            val tv = layout.findViewById<TextView>(R.id.txtVw)
            tv.text = "CUSTOM TOAST NOTIFICATION"

            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 0, 50)
            toast.setView(layout)
            toast.duration = Toast.LENGTH_LONG
            toast.show()
        }
    }
}