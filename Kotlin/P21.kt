package alpha.dex.dexsix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAlert = findViewById<Button>(R.id.btnAlert)

        btnAlert.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Login Alert")
                .setMessage("Are you sure, you want to continue ?")
                .setCancelable(true)
                // .setMessage("this is alert")
                .setIcon(android.R.drawable.ic_dialog_alert)


            //performing positive action
            builder.setPositiveButton("Yes") { dialogInterface, which ->
                Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_LONG).show()
            }
            //performing cancel action
            builder.setNeutralButton("Cancel") { dialogInterface, which ->
                Toast.makeText(
                    applicationContext,
                    "clicked cancel\n operation cancel",
                    Toast.LENGTH_LONG
                ).show()
            }
            //performing negative action
            builder.setNegativeButton("No") { dialogInterface, which ->
                Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()
            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}