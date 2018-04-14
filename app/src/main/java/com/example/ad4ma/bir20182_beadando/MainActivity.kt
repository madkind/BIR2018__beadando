package com.example.ad4ma.bir20182_beadando

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        feladat1.setOnClickListener{
            val intent = Intent(this, Feladat1Activity::class.java)
            startActivity(intent)
        }
        feladat2.setOnClickListener{

        }
    }
}
