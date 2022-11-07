package alpha.dex.dexsix

import android.content.DialogInterface
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*
import kotlin.collections.ArrayList

class CustomAlert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert)

        val btnSimpleAlert = findViewById<Button>(R.id.btnSimpleAlert)
        val btnAlertWithItems = findViewById<Button>(R.id.btnAlertWithItems)
        val btnAlertWithMultiChoiceItems = findViewById<Button>(R.id.btnAlertWithMultiChoiceItems)
        val btnAlertWithEditText = findViewById<Button>(R.id.btnAlertWithEditText)

        btnSimpleAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Simple Alert")
                .setMessage("We have a message")
                .setPositiveButton("OK") { dialog, which ->
                    Toast.makeText(applicationContext, "OK was clicked", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("No") { dialog, which ->
                    Toast.makeText(applicationContext, "NO was clicked", Toast.LENGTH_SHORT).show()
                }
                .setCancelable(false)
                .show()
        }

        btnAlertWithItems.setOnClickListener {
            val items = arrayOf("Apple", "Banana", "Orange", "Grapes")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("List of Items")
                .setItems(items) { dialog, which ->
                    Toast.makeText(
                        applicationContext,
                        items[which] + " is clicked",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .setPositiveButton("OK", null)
                .setNegativeButton("CANCEL", null)
                .setNeutralButton("NEUTRAL", null)

            val alertDialog = builder.create()
            alertDialog.show()
            val button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
            val buttonN = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)

            buttonN.setBackgroundColor(Color.RED)
            button.setBackgroundColor(Color.BLACK)

            button.setPadding(0, 0, 20, 0)
            buttonN.setPadding(20, 0, 20, 0)

            button.setTextColor(Color.WHITE)
            buttonN.setTextColor(Color.BLUE)

        }

        btnAlertWithMultiChoiceItems.setOnClickListener {
            val items = arrayOf("Apple", "Banana", "Orange", "Grapes")
            val selectedList = ArrayList<String>()
            val builder = AlertDialog.Builder(this)

                .setTitle("This is Multi Choice")
                .setMultiChoiceItems(items, null) { dialog, which, isChecked ->
                    if (isChecked)
                        selectedList.add(items[which])
                    else if (selectedList.contains(items[which]))
                        selectedList.remove(items[which])
                }
                .setPositiveButton("Done") { dialog, i ->
                    Toast.makeText(
                        applicationContext,
                        "items selected are: " + Arrays.toString(selectedList.toTypedArray()),
                        Toast.LENGTH_LONG
                    ).show()
                }
            builder.show()
        }

        btnAlertWithEditText.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("With Edit Text")
            val input = EditText(this)
            val lp = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            input.layoutParams = lp
            builder.setView(input)
            builder.setPositiveButton("OK") { dialogInterface, i ->
                Toast.makeText(
                    applicationContext,
                    "Text entered is " + input.text.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
            builder.show()
        }
    }
}