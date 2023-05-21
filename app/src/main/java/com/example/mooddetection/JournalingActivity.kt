package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class JournalingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.journaling_page)

        findViewById<ImageView>(R.id.imageHomeButton).setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.imageProfile).setOnClickListener{
            val intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)
        }
    }
}