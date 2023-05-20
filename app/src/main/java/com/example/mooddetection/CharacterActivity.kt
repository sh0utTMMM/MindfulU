package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.mooddetection.DailyGame

class CharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)
        val b = intent.extras

        val ImgCharacter = findViewById<ImageView>(R.id.myCharacter)
        if (b != null) {
            ImgCharacter.setImageResource(b.getInt("imagePath"))
        }


        findViewById<Button>(R.id.goToMap).setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
    }
    fun GoToNotify(view: View) {
        val intent = Intent(this, NotificationPage::class.java)
        startActivity(intent)
    }
}
