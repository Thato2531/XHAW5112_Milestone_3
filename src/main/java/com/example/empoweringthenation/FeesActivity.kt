package com.example.empoweringthenation

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeesActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fees)

        val cbFirstAid = findViewById<CheckBox>(R.id.cbFirstAid)
        val cbSewing = findViewById<CheckBox>(R.id.cbSewing)
        val cbCooking = findViewById<CheckBox>(R.id.cbCooking)
        val cbChildMinding = findViewById<CheckBox>(R.id.cbChildMinding)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnCalculate.setOnClickListener {
            var total = 0
            if (cbFirstAid.isChecked) total += 1500
            if (cbSewing.isChecked) total += 1500
            if (cbCooking.isChecked) total += 750
            if (cbChildMinding.isChecked) total += 750

            tvResult.text = "Total: R$total"
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
