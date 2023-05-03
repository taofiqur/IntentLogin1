package com.example.intentlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val email = findViewById<TextView>(R.id.tvEmail)
        val data = intent.getStringExtra("email").toString()
        email.text= data

    }
}

