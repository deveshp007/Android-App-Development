package alpha.dex.dexsix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Helpers.update
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout

class Contact : AppCompatActivity() {

    var listView: ListView? = null
    var adapter: ArrayAdapter<String>? = null
    var contacts = arrayListOf<String>("Ajay")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val fButton =
            findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.fab)
        fButton.setOnClickListener {
            addContact()
        }

        listView = findViewById<ListView>(R.id.listView)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts)
        listView?.setAdapter(adapter)
// Register the ListView for Context menu
        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater = menuInflater
        inflater.inflate(R.menu.contact_menu, menu)
        menu.setHeaderTitle("Select The Action")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var pos1 = item.menuInfo as AdapterView.AdapterContextMenuInfo
        var pos = pos1.position
        if (item.itemId == R.id.update) {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("Update")
            val input = EditText(this)
            val lp = ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            input.layoutParams = lp
            builder.setView(input)
            input.setText(contacts[pos])

            builder.setPositiveButton("OK") { dialogInterface, i ->
                contacts.set(pos, input.text.toString())
                adapter?.notifyDataSetChanged()
                contacts.sort()
                Toast.makeText(applicationContext, "Successfully Updated", Toast.LENGTH_SHORT)
                    .show()
            }
            builder.show()
        } else if (item.itemId == R.id.delete) {
            contacts.removeAt(pos)
            adapter?.notifyDataSetChanged()
            Toast.makeText(applicationContext, "Successfully Deleted", Toast.LENGTH_LONG).show()
        } else
            return false
        return true
    }

    private fun addContact() {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("Insert")
        val input = EditText(this)
        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        input.layoutParams = lp
        builder.setView(input)

        builder.setPositiveButton("OK") { dialogInterface, i ->
            contacts.add(input.text.toString())
            adapter?.notifyDataSetChanged()
            contacts.sort()
            Toast.makeText(applicationContext, "Successfully Inserted", Toast.LENGTH_SHORT).show()
        }
        builder.show()
    }
}