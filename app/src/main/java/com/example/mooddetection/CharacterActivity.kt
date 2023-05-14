package com.example.mooddetection

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.character)
        val b = intent.extras


        val ImgCharacter = findViewById<ImageView>(R.id.myCharacter);
        if(b !== null){
            ImgCharacter.setImageResource(b.getInt("imagePath"))
        }
    }
}