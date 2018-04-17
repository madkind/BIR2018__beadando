package com.example.ad4ma.bir20182_beadando

import android.graphics.Canvas
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager

class Feladat1Activity : AppCompatActivity() {

    val cv : CanvasView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cv = CanvasView(this)
        setContentView(cv)


       // cv.drawAll()

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    override fun onStart() {
        super.onStart()
        BluetoothManager.getInstance()?.setOnDataReceivedListener { data, message ->
           try {
               Log.d("BT",message)
              var splitted = message.split(":")
               cv?.addDrawablePoint(DrawablePoint(splitted[0].toDouble(),splitted[1].toDouble()))
               cv?.drawAll()
           }catch (e: Exception){}
        }
        cv?.drawAll()
    }
}
