package com.example.layout

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailButton = findViewById<Button>(R.id.email)
        val phoneButton = findViewById<Button>(R.id.phone)
        emailButton.setOnClickListener {
            Toast.makeText(this, "email@gmail.com", Toast.LENGTH_SHORT).show()
        }
        phoneButton.setOnClickListener {
            Toast.makeText(this, "+380(00)-000-00-00", Toast.LENGTH_SHORT).show()
        }
    }
}