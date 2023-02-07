package com.example.tatonasapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {
    private var btnLogin : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
        supportActionBar?.hide()
        btnLogin = findViewById(R.id.buttonLogin)
        btnLogin!!.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}