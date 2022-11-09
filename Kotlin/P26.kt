package alpha.dex.dexsix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Option : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.optionmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return when (id) {
            R.id.Settings -> {
                Toast.makeText(applicationContext, "settings Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.Play -> {
                Toast.makeText(applicationContext, "play Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.Pause -> {
                Toast.makeText(applicationContext, "pause Selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.Exit -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}