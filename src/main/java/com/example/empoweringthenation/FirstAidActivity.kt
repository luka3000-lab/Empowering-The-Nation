package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstAidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        // Back button
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish() // return to previous screen
        }

        // Enroll button → goes to Contact page
        findViewById<Button>(R.id.btnEnroll).setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
    }
}
