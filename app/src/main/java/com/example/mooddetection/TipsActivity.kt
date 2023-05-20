package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tips_page)

        val ImgCharacter = findViewById<ImageView>(R.id.imageHomeButton)

        ImgCharacter.setOnClickListener{
            val intent= Intent(this, CharacterActivity::class.java)
            startActivity(intent)
        }
    }
}