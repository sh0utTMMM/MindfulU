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

            val bundleAnswer1 = Bundle().apply {
                putInt("selectedAnswerQ1", responses[0])
            }

            val intent = Intent(this, SecondQuestion::class.java)
            intent.putExtras(bundleAnswer1)
            startActivity(intent)
        }
    }
}
