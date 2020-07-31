package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basketball.*

class Basketball : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basketball)
        btnNEXT.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity::class.java))
        }
        btnPrevious.setOnClickListener {
            startActivity(Intent(baseContext,Nature::class.java))
        }
    }
}