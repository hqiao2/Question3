package com.example.question3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataToCalculator = "Calculator"
        val dataToQuestion2 = "Question2"

        val calculatorApp = Intent().apply {
            action = "com.example.calculator"
            putExtra("data", dataToCalculator)
        }

        val question2App = Intent().apply {
            action = "com.example.question2"
            putExtra("data", dataToQuestion2)
        }

        startActivity(calculatorApp)
        startActivity(question2App)
    }
}