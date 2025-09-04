package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculateActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId" , "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)

        // Course prices
        val priceSixMonth = 1500
        val priceSixWeek = 750

        // Checkboxes
        val checkFirstAid = findViewById<CheckBox>(R.id.checkFirstAid)
        val checkSewing = findViewById<CheckBox>(R.id.checkSewing)
        val checkLifeSkills = findViewById<CheckBox>(R.id.checkLifeSkills)
        val checkLandscaping = findViewById<CheckBox>(R.id.checkLandscaping)
        val checkChildMinding = findViewById<CheckBox>(R.id.checkChildMinding)
        val checkGardenMaintenance = findViewById<CheckBox>(R.id.checkGardenMaintenance)
        val checkCooking = findViewById<CheckBox>(R.id.checkCooking)

        // Result text
        val txtResult = findViewById<TextView>(R.id.txtResult)

        // Calculate Button
        findViewById<Button>(R.id.btnCalculate).setOnClickListener {
            var total = 0

            // Six-month courses
            if (checkFirstAid.isChecked) total += priceSixMonth
            if (checkSewing.isChecked) total += priceSixMonth
            if (checkLifeSkills.isChecked) total += priceSixMonth

            // Six-week courses
            if (checkLandscaping.isChecked) total += priceSixWeek
            if (checkChildMinding.isChecked) total += priceSixWeek
            if (checkGardenMaintenance.isChecked) total += priceSixWeek
            if (checkCooking.isChecked) total += priceSixWeek

            txtResult.text = "Total: R$total"
        }

        // Back Button
        findViewById<Button>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
