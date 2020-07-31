package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_basketball.*
import kotlinx.android.synthetic.main.activity_basketball.btnPrevious
import kotlinx.android.synthetic.main.activity_vacation.*

class Vacation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacation)
        btnPrevious.setOnClickListener{
            startActivity(Intent(baseContext,Coding::class.java))

        }
        btnNext.setOnClickListener {
            startActivity(Intent(baseContext,Nature::class.java))
        }

    }
}