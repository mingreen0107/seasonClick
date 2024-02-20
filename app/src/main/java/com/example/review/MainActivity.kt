package com.example.review

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spring = findViewById<ImageView>(R.id.spring)
        spring.setOnClickListener {
            var intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("string", "spring")
            startActivity(intent)
        }

        val summer = findViewById<ImageView>(R.id.summer)
        summer.setOnClickListener {
            var intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("string", "summer")
            startActivity(intent)
        }
        val fall = findViewById<ImageView>(R.id.fall)
        fall.setOnClickListener {
            var intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("string", "fall")
            startActivity(intent)
        }
        val winter = findViewById<ImageView>(R.id.winter)
        winter.setOnClickListener {
            var intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("string", "winter")
            startActivity(intent)
        }

    }

}