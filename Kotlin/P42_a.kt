package com.example.cse225_one

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class CustomDrawing2 : View {

    lateinit var p: Paint
    lateinit var mpath: Path

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attributeSet: AttributeSet) : super(context, attributeSet) {
        init()
    }

    fun init() {
        p = Paint()
        mpath = Path()
        p.color = Color.BLACK
        p.style = Paint.Style.STROKE
        p.strokeWidth = 10f
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.MAGENTA)
        canvas.drawPath(mpath, p)
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> mpath.moveTo(event.x, event.y)
            MotionEvent.ACTION_MOVE -> mpath.lineTo(event.x, event.y)
        }
        invalidate()

        return true
    }

    fun clearCanvas() {
        mpath.reset()
        postInvalidate()
    }
}