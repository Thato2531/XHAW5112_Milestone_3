package com.example.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCourses: Button = findViewById(R.id.btnCourses)
        val btnNews: Button = findViewById(R.id.btnNews)
        val btnFees: Button = findViewById(R.id.btnFees)
        val btnAbout: Button = findViewById(R.id.btnAbout)

        btnCourses.setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
        }

        btnNews.setOnClickListener {
            startActivity(Intent(this, NewsActivity::class.java))
        }

        btnFees.setOnClickListener {
            startActivity(Intent(this, FeesActivity::class.java))
        }

        btnAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}
