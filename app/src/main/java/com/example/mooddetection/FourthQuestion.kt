package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class FourthQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fourth_question)
        //Bundling passed from previous Views
        val selectedAnswerQ1 = intent.extras?.getInt("selectedAnswerQ1")
        val selectedAnswerQ2 = intent.extras?.getInt("selectedAnswerQ2")
        val selectedAnswerQ3 = intent.extras?.getInt("selectedAnswerQ3")


        val button = findViewById<Button>(R.id.btn_submit)

        button.setOnClickListener {
            val radioGroup4 = findViewById<RadioGroup>(R.id.rg_question4)
            val radioButtonId4 = radioGroup4.checkedRadioButtonId

            val responses = IntArray(4)


            if (radioButtonId4 != -1) {
                val radioButton4 = findViewById<RadioButton>(radioButtonId4)
                val index4 = radioGroup4.indexOfChild(radioButton4)
                responses[3] = index4 + 1
            }

            val bundleAnswer4 = Bundle().apply {
                if (selectedAnswerQ1 != null) {
                    putInt("selectedAnswerQ1", selectedAnswerQ1)
                }
                if (selectedAnswerQ2 != null) {
                    putInt("selectedAnswerQ2", selectedAnswerQ2)
                }
                if (selectedAnswerQ3 != null) {
                    putInt("selectedAnswerQ3", selectedAnswerQ3)
                }
                putInt("selectedAnswerQ4", responses[3])
            }


            val intent = Intent(this, SpotifyPage::class.java)
            intent.putExtras(bundleAnswer4)
            startActivity(intent)

        }

        val radioAnswer1 = findViewById<RadioButton>(R.id.rb_question4_answer1)
        val radioAnswer2 = findViewById<RadioButton>(R.id.rb_question4_answer2)
        val radioAnswer3 = findViewById<RadioButton>(R.id.rb_question4_answer3)
        val radioAnswer4 = findViewById<RadioButton>(R.id.rb_question4_answer4)



        radioAnswer1.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer2.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer3.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer4.background = resources.getDrawable(R.drawable.custom_radiobutton)


    }
}