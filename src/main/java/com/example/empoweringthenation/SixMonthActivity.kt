package com.example.empoweringthenation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixMonthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
