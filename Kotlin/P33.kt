package alpha.dex.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.TextView

class Progress_BarEx : AppCompatActivity() {

    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar_ex)

        val pgsBar = findViewById<android.widget.ProgressBar>(R.id.pBar)
        val pgsBar1 = findViewById<android.widget.ProgressBar>(R.id.pBarCircular)
        val txtView = findViewById<TextView>(R.id.tView)
        val btn = findViewById<Button>(R.id.btnShow)
        val btnR = findViewById<Button>(R.id.btnReset)
        val pauseth = findViewById<Button>(R.id.pauseThread)
        var flag: Int

//        pgsBar1.visibility = View.INVISIBLE
        txtView.text = i.toString() + "/" + pgsBar.max

        pauseth.setOnClickListener {
            flag = 0
            btn.text = "Resume"
        }
        btn.setOnClickListener {
            flag = 1
            pgsBar1.visibility = View.VISIBLE
            i = pgsBar.progress
            Thread {
                while (i < 100) {
                    i += 1
                    if (flag == 0) {
                        pgsBar1.visibility = View.INVISIBLE
                        break
                    }

                    Handler(Looper.getMainLooper()).post {
                        pgsBar.progress = i
                        txtView.text = i.toString() + "/" + pgsBar.max

                        if (i == 100) { //Or pgsBar.max in place of 100
                            pgsBar1.visibility = View.INVISIBLE
//                            btn.text = "Start again"
//                            i = 0
//                            pgsBar.progress = i
                        }
                    }

                    try {
                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }.start()

        }


        btnR.setOnClickListener {
            pgsBar.progress = 0
            txtView.text = 0.toString() + "/" + pgsBar.max
            pgsBar1.visibility = View.INVISIBLE
            flag = 0
            btn.text = "Start Again"

        }
    }
}