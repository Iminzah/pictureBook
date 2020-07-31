package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nature.*

class Nature : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nature)
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,Vacation::class.java))
        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,Basketball::class.java))
        }
    }
}