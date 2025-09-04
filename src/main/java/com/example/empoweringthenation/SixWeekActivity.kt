package com.example.empoweringthenation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixWeekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
