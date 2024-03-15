package com.example.androidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button0: Button = findViewById(R.id.button_0)
        val button1: Button = findViewById(R.id.button_1)
        val button2: Button = findViewById(R.id.button_2)
        val button3: Button = findViewById(R.id.button_3)
        val button4: Button = findViewById(R.id.button_4)
        val button5: Button = findViewById(R.id.button_5)
        val button6: Button = findViewById(R.id.button_6)
        val button7: Button = findViewById(R.id.button_7)
        val button8: Button = findViewById(R.id.button_8)
        val button9: Button = findViewById(R.id.button_9)

        val buttonAdd: Button = findViewById(R.id.button_add)
        val buttonSubtract: Button = findViewById(R.id.button_subtract)
        val buttonMultiply: Button = findViewById(R.id.button_multiply)
        val buttonDivide: Button = findViewById(R.id.button_divide)

        val textView: TextView = findViewById(R.id.textView)

        button0.setOnClickListener {
            textView.append("0")
        }
        button1.setOnClickListener {
            textView.append("1")
        }
        button2.setOnClickListener {
            textView.append("2")
        }
        button3.setOnClickListener {
            textView.append("3")
        }
        button4.setOnClickListener {
            textView.append("4")
        }
        button5.setOnClickListener {
            textView.append("5")
        }
        button6.setOnClickListener {
            textView.append("6")
        }
        button7.setOnClickListener {
            textView.append("7")
        }
        button8.setOnClickListener {
            textView.append("8")
        }
        button9.setOnClickListener {
            textView.append("9")
        }
        buttonAdd.setOnClickListener {
            textView.append("+")
        }
        buttonSubtract.setOnClickListener {
            textView.append("-")
        }
        buttonMultiply.setOnClickListener {
            textView.append("*")
        }
        buttonDivide.setOnClickListener {
            textView.append("/")
        }
    }
}