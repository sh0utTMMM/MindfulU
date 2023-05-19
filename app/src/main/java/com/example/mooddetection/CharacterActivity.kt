package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mooddetection.DailyGame

class CharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)
        val b = intent.extras

        val goToDailyGameButton = findViewById<Button>(R.id.goToDailyGame)
        goToDailyGameButton.setOnClickListener {
            val intent = Intent(this@CharacterActivity, DailyGame::class.java)
            startActivity(intent)
        }

        val ImgCharacter = findViewById<ImageView>(R.id.myCharacter)
        if (b != null) {
            ImgCharacter.setImageResource(b.getInt("imagePath"))
        }

        findViewById<Button>(R.id.goToNotification).setOnClickListener {
            val intent = Intent(this, com.example.mooddetection.NotificationPage::class.java)
            startActivity(intent)
        }
    }
}
