package com.example.ad4ma.bir20182_beadando

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class Feladat1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(CanvasView(this))
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
    }
}
