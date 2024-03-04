package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val textView: TextView = findViewById(R.id.textView)

        button1.setOnClickListener {
            textView.setText(R.string.hello_world)
        }
        button2.setOnClickListener {
            textView.setText(R.string.name)
        }
        button3.setOnClickListener {
            textView.setText(R.string.goodbye_world)
        }
    }
}