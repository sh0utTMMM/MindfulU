package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LogInPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        findViewById<Button>(R.id.createCharacter).setOnClickListener {
            val intent = Intent(this, FirstQuestion::class.java)
            startActivity(intent)
        }
}
}