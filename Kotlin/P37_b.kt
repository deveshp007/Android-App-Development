package alpha.dex.one

import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NotifMain : AppCompatActivity() {

    lateinit var notificationManager: NotificationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notif_main)


        var txtView = findViewById<TextView>(R.id.tv)

        var inp = Notif()

        txtView.text = "Hey!!"

        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.cancel(inp.notificationId)
    }
}