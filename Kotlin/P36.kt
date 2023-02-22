package alpha.dex.one

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.job.JobInfo
import android.app.job.JobParameters
import android.app.job.JobScheduler
import android.app.job.JobService
import android.content.ComponentName
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class JobSchedulerEx : AppCompatActivity() {

    var jobScheduler: JobScheduler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_scheduler_ex)

        val stopJob = findViewById<Button>(R.id.stopJob)
        val startJob = findViewById<Button>(R.id.startJob)

        startJob.setOnClickListener {
            jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler
            val componentName = ComponentName(this, MyJobService::class.java)
            val builder = JobInfo.Builder(123, componentName)
            builder.setMinimumLatency(8000)
            builder.setOverrideDeadline(10000)
            builder.setPersisted(true)
            builder.setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            builder.setRequiresCharging(false)
            jobScheduler!!.schedule(builder.build())
        }

        stopJob.setOnClickListener {
            if (jobScheduler != null) {
                jobScheduler!!.cancel(123)
                jobScheduler = null
                Toast.makeText(this, "Job Cancelled", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

class MyJobService : JobService() {

    override fun onStartJob(p0: JobParameters?): Boolean {
        Log.d("TAG", "onStartJob:")
        val intent = Intent(this@MyJobService, AlarmManagerBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this@MyJobService, 234, intent, 0)
        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), pendingIntent)
        Toast.makeText(this@MyJobService, "Alarm Set ", Toast.LENGTH_LONG).show()
        return true
    }

    override fun onStopJob(p0: JobParameters?): Boolean {
        Log.d("TAG", "onStopJob:")
        return true
    }

}