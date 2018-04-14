package com.example.ad4ma.bir20182_beadando

import android.graphics.Canvas
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class Feladat1Activity : AppCompatActivity() {

    val cv : CanvasView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cv = CanvasView(this)
        setContentView(cv)
        cv.addDrawablePoint(DrawablePoint(0.toDouble(),100.toDouble()))
        cv.addDrawablePoint(DrawablePoint(10.toDouble(),100.toDouble()))
        cv.addDrawablePoint(DrawablePoint(30.toDouble(),100.toDouble()))
        cv.addDrawablePoint(DrawablePoint(40.toDouble(),100.toDouble()))
        cv.addDrawablePoint(DrawablePoint(100.toDouble(),100.toDouble()))

       // cv.drawAll()

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    override fun onStart() {
        super.onStart()
        cv?.drawAll()
    }
}
