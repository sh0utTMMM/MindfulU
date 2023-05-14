package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button by its ID
        val button = findViewById<Button>(R.id.btn_submit)

        // Set a click listener on the button
        button.setOnClickListener {

            // Ask the user each question and get their response
            val responses = IntArray(4)

            val radioGroup1 = findViewById<RadioGroup>(R.id.rg_question1)
            val radioButtonId1 = radioGroup1.checkedRadioButtonId
            if (radioButtonId1 != -1) {
                val radioButton1 = findViewById<RadioButton>(radioButtonId1)
                val index1 = radioGroup1.indexOfChild(radioButton1)
                responses[0] = index1 + 1
            }

            val radioGroup2 = findViewById<RadioGroup>(R.id.rg_question2)
            val radioButtonId2 = radioGroup2.checkedRadioButtonId
            if (radioButtonId2 != -1) {
                val radioButton2 = findViewById<RadioButton>(radioButtonId2)
                val index2 = radioGroup2.indexOfChild(radioButton2)
                responses[1] = index2 + 1
            }

            val radioGroup3 = findViewById<RadioGroup>(R.id.rg_question3)
            val radioButtonId3 = radioGroup3.checkedRadioButtonId
            if (radioButtonId3 != -1) {
                val radioButton3 = findViewById<RadioButton>(radioButtonId3)
                val index3 = radioGroup3.indexOfChild(radioButton3)
                responses[2] = index3 + 1
            }

            val radioGroup4 = findViewById<RadioGroup>(R.id.rg_question4)
            val radioButtonId4 = radioGroup4.checkedRadioButtonId
            if (radioButtonId4 != -1) {
                val radioButton4 = findViewById<RadioButton>(radioButtonId4)
                val index4 = radioGroup4.indexOfChild(radioButton4)
                responses[3] = index4 + 1
            }

             fun setImage():Int {

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
