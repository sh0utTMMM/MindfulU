package com.example.mooddetection

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map) // your layout here
        // Your existing code...

        findViewById<ImageView>(R.id.game).setOnClickListener{
            val intent = Intent(this, DailyGame::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.journal).setOnClickListener{
            val intent = Intent(this, JournalingActivity::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.imageHomeButton).setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.imageProfile).setOnClickListener{
            val intent = Intent(this, CharacterActivity::class.java)
            startActivity(intent)
        }
        findViewById<ImageView>(R.id.imageTipsButton).setOnClickListener{
            val intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }
    }
    fun GoToCheck(view: View) {
        val intent = Intent(this, DailyCheck::class.java)
        startActivity(intent)
    }

}
