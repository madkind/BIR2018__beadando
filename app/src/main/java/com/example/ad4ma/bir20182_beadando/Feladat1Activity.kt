package com.example.ad4ma.bir20182_beadando

import android.graphics.Canvas
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager

class Feladat1Activity : AppCompatActivity() {

        lateinit var cv: CanvasView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cv = CanvasView(this)
        setContentView(cv)


       if(cv == null)
           Log.d("CV", " oncreate null")
        else
           Log.d("CV", " oncreate initialized")
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }

    override fun onResume() {
        super.onResume()
        BluetoothManager.getInstance()?.setOnDataReceivedListener { data, message ->
           try {
               Log.d("BT",message)
              var splitted = message.split(":")
               cv.addDrawablePoint(DrawablePoint(splitted[0].toDouble(),splitted[1].toDouble()))

               cv.drawAll()
           }catch (e: Exception){}
        }

    }

}
