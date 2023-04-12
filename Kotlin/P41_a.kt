package com.example.cse225_one

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class CustomDrawing(context: Context?) : View(context) {
    lateinit var p: Paint

    var x: Int = 0
    fun init() {
        p = Paint()
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.BLUE)

        p.color = Color.YELLOW
        canvas.drawRect(100f, 100f, 500f, 500f, p)
        p.color = Color.GREEN

        canvas.drawRect(105f, 100f, 500f, 500f, p)
        canvas.drawArc(500f, 500f, 800f, 800f, x.toFloat(), 30f, true, p)
        canvas.drawArc(500f, 500f, 800f, 800f, (x + 120).toFloat(), 30f, true, p)
        canvas.drawArc(500f, 500f, 800f, 800f, (x + 240).toFloat(), 30f, true, p)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        for (i in 0..50000) {
            when (event?.action) {
                MotionEvent.ACTION_MOVE -> startFan()
                MotionEvent.ACTION_UP -> stopFan()
            }
        }
        return true
    }

    fun stopFan() {}
    fun startFan() {
        x = x + 5
        invalidate()
    }

    init {
        init()
    }
}