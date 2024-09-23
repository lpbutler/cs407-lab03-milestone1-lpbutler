package com.cs407.calcactivity

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val inputOne = findViewById<EditText>(R.id.num1)
        val inputTwo = findViewById<EditText>(R.id.num2)

        findViewById<Button>(R.id.add).setOnClickListener() {
            val num1 = inputOne.text.toString().toIntOrNull()
            val num2 = inputTwo.text.toString().toIntOrNull()

            if (num1 == null || num2 == null) {
                Toast.makeText(this,"Please enter valid integers",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val result = num1 + num2
            val intent = Intent(this,resultScreen::class.java).apply {
                putExtra("Result: ",result.toString())
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.sub).setOnClickListener() {
            val num1 = inputOne.text.toString().toIntOrNull()
            val num2 = inputTwo.text.toString().toIntOrNull()

            if (num1 == null || num2 == null) {
                Toast.makeText(this,"Please enter valid integers",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val result = num1 - num2
            val intent = Intent(this,resultScreen::class.java).apply {
                putExtra("Result: ",result.toString())
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.mult).setOnClickListener() {
            val num1 = inputOne.text.toString().toIntOrNull()
            val num2 = inputTwo.text.toString().toIntOrNull()

            if (num1 == null || num2 == null) {
                Toast.makeText(this,"Please enter valid integers",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val result = num1 * num2
            val intent = Intent(this,resultScreen::class.java).apply {
                putExtra("Result: ",result.toString())
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.div).setOnClickListener() {
            val num1 = inputOne.text.toString().toIntOrNull()
            val num2 = inputTwo.text.toString().toIntOrNull()

            if (num1 == null || num2 == null || num2 == 0) {
                Toast.makeText(this,"Please enter valid integers",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val result = num1 / num2
            val intent = Intent(this,resultScreen::class.java).apply {
                putExtra("Result: ",result.toString())
            }
            startActivity(intent)
        }

    }
}