package com.example.tatonasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var btnHardware : ImageView ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btnHardware = findViewById(R.id.btnHardware)
        btnHardware!!.setOnClickListener {
            val intent = Intent(this@MainActivity, HardwareActivity::class.java)
            startActivity(intent)
        }


    }
}