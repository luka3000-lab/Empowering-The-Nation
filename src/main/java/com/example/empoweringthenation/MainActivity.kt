package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSixMonth = findViewById<Button>(R.id.btnSixMonth)
        val btnSixWeek = findViewById<Button>(R.id.btnSixWeek)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val btnContact = findViewById<Button>(R.id.btnContact)

        btnSixMonth.setOnClickListener {
            startActivity(Intent(this, SixMonthActivity::class.java))
        }
        btnSixWeek.setOnClickListener {
            startActivity(Intent(this, SixWeekActivity::class.java))
        }
        btnCalculate.setOnClickListener {
            startActivity(Intent(this, CalculateActivity::class.java))
        }
        btnContact.setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }
    }
}
