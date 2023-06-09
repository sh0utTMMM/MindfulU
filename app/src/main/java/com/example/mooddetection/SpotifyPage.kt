package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class SpotifyPage: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spotify_page)
        val selectedAnswerQ1 = intent.extras?.getInt("selectedAnswerQ1")
        val selectedAnswerQ2 = intent.extras?.getInt("selectedAnswerQ2")
        val selectedAnswerQ3 = intent.extras?.getInt("selectedAnswerQ3")
        val selectedAnswerQ4 = intent.extras?.getInt("selectedAnswerQ4")

        findViewById<Button>(R.id.skip).setOnClickListener {

            val responses = IntArray(4)

            if (selectedAnswerQ1 != null) {
                responses[0] = selectedAnswerQ1
            }
            if (selectedAnswerQ2 != null) {
                responses[1] = selectedAnswerQ2
            }
            if (selectedAnswerQ3 != null) {
                responses[2] = selectedAnswerQ3
            }
            if (selectedAnswerQ4 != null) {
                responses[3] = selectedAnswerQ4
            }

            println("responses: ${responses.joinToString()}")

            fun setImage(): Int {

                // Display the image based on the user's responses
                val imagePath = when {
                    responses[0] == 1 && responses[1] == 2 && responses[2] == 3 && responses[3] == 4 -> R.drawable.img1
                    responses[0] == 4 && responses[1] == 3 && responses[2] == 2 && responses[3] == 1 -> R.drawable.img2
                    else -> R.drawable.img3
                }
                // Display the image here
                return imagePath
            }

            val intent = Intent(this, CharacterActivity::class.java)
            val b = Bundle()
            b.putInt("imagePath", setImage())
            intent.putExtras(b)
            startActivity(intent)


        }

    }
}