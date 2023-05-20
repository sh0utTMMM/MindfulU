package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map) // your layout here
        // Your existing code...
    }
    fun GoToDailyGame(view: View) {
        val intent = Intent(this, DailyGame::class.java)
        startActivity(intent)
    }
    fun GoToTips(view: View) {
        val intent = Intent(this, TipsActivity::class.java)
        startActivity(intent)
    }
    fun GoToProfile(view: View) {
        val intent = Intent(this, CharacterActivity::class.java)
        startActivity(intent)
    }
    fun GoToMap(view: View) {
        val intent = Intent(this, Map::class.java)
        startActivity(intent)
    }
}
