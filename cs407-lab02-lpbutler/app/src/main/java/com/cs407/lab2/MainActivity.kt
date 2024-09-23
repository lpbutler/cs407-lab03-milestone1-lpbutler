package com.cs407.lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.myTextField3)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText = findViewById<EditText>(R.id.myTextField4)
        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            val userInput = editText.text.toString()
            //Toast.makeText(this, userInput, Toast.LENGTH_SHORT).show()

            //create an intent to navigate to Calculator Activity
            val intent = Intent(this, CalculatorActivity::class.java)
            //Pass the user into this new activity
            intent.putExtra("EXTRA_MESSAGE", userInput)
            //start the new activity
            startActivity(intent)
        }
    }
}