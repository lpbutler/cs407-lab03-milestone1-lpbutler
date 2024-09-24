package com.cs407.lab3_milestone1

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.button)
        submitButton.setOnClickListener{
            showDialog()
        }
    }

    private fun showDialog(){
        AlertDialog.Builder(this)
            .setTitle("Dialog Title")
            .setMessage("This is a dialog message")
            .setPositiveButton("OK"){dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean{
        menuInflater.inflate(R.menu.example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        return when (item.itemId){
            R.id.item1 ->{
                Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item2 ->{
                Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subItem1 ->{
                Toast.makeText(this, "SubItem 1 selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.subItem2 ->{
                Toast.makeText(this, "SubItem 2 selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}