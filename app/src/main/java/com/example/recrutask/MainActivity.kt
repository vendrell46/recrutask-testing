package com.example.recrutask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.ToggleButton

const val EXTRA_MESSAGE = "com.example.recrutask.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val switch1: ToggleButton = findViewById(R.id.toggleButton)
        val switch2: ToggleButton = findViewById(R.id.toggleButton2)
        switch1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val textView = findViewById<TextView>(R.id.textView3).apply {
                    text = "okay"
                }
                val textView2 = findViewById<TextView>(R.id.textView4).apply {
                    text = "okay"
                }
        } else {
                val textView = findViewById<TextView>(R.id.textView3).apply {
                    text = "Default"
                }
                val textView2 = findViewById<TextView>(R.id.textView4).apply {
                    text = "Default"
                }
            }
        }
        switch2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val textView = findViewById<TextView>(R.id.textView3).apply {
                    text = "okay"
                }
                val textView2 = findViewById<TextView>(R.id.textView4).apply {
                    text = "okay"
                }
            } else {
                val textView = findViewById<TextView>(R.id.textView3).apply {
                    text = "Default"
                }
                val textView2 = findViewById<TextView>(R.id.textView4).apply {
                    text = "Default"
                }
            }}
    }

    fun moveToNextView(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPassword)
        val message = editText.text.toString()
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)}
        startActivity(intent)
    }
}