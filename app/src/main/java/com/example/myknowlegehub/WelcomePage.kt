package com.example.myknowlegehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        val welBtn = findViewById<Button>(R.id.letsGoBtn)

        welBtn.setOnClickListener{
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}