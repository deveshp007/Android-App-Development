package alpha.dex.one

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class AlarmManagerEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_manager_ex)

        var start = findViewById<Button>(R.id.button)
        var RStart = findViewById<Button>(R.id.RStart)
        var cancel = findViewById<Button>(R.id.cancel_button)
        var Etext = findViewById<EditText>(R.id.time)
        var alarmManager: AlarmManager
        val intent = Intent(this, AlarmManagerBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 234, intent, 0)


        start.setOnClickListener {
            var i = Etext.text.toString().toInt()
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.set(
                AlarmManager.RTC_WAKEUP, System.currentTimeMillis() +
                        (i * 1000), pendingIntent
            )
            Toast.makeText(this, "Alarm set in $i seconds", Toast.LENGTH_LONG).show()
        }

        RStart.setOnClickListener {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP, System.currentTimeMillis(),
                5000, pendingIntent
            )
            Toast.makeText(this, "Repeating Alarm 5 Seconds", Toast.LENGTH_LONG).show()
        }

        cancel.setOnClickListener {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.cancel(pendingIntent)
            Toast.makeText(this, "Alarm Cancelled", Toast.LENGTH_SHORT).show()
        }
    }
}


class AlarmManagerBroadcast : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val mp = MediaPlayer.create(context, R.raw.ringtone)
        Log.d("Hello", "repeating alarm")
        mp.start()
        Toast.makeText(context, "Alarm Ringing", Toast.LENGTH_LONG).show()
    }
}


