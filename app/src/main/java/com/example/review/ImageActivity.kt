package com.example.review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val string = intent.getStringExtra("string")

        val seasonImage = findViewById<ImageView>(R.id.seasonImageArea)

        if(string == "spring") {
            seasonImage.setImageResource(R.drawable.spring)
        } else if(string == "summer") {
            seasonImage.setImageResource(R.drawable.summer)
        } else if(string == "fall") {
            seasonImage.setImageResource(R.drawable.fall)
        } else {
            seasonImage.setImageResource(R.drawable.winter)
        }

    }

}