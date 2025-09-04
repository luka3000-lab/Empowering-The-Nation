package com.example.empoweringthenation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
