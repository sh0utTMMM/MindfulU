package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tips_page)
    }
    fun GoToMap(view: View) {
        val intent = Intent(this, Map::class.java)
        startActivity(intent)
    }
}