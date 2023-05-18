package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class ThirdQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_question)
        val button = findViewById<Button>(R.id.btn_submit)

        //Bundling passed from previous Views
        val selectedAnswerQ1 = intent.extras?.getInt("selectedAnswerQ1")
        val selectedAnswerQ2 = intent.extras?.getInt("selectedAnswerQ2")

        button.setOnClickListener {
            val radioGroup3 = findViewById<RadioGroup>(R.id.rg_question3)
            val radioButtonId3 = radioGroup3.checkedRadioButtonId

            val responses = IntArray(4)
            if (radioButtonId3 != -1) {
                val radioButton3 = findViewById<RadioButton>(radioButtonId3)
                val index3 = radioGroup3.indexOfChild(radioButton3)
                responses[2] = index3 + 1
            }

            val bundleAnswer3 = Bundle().apply {
                if (selectedAnswerQ1 != null) {
                    putInt("selectedAnswerQ1", selectedAnswerQ1)
                }
                if (selectedAnswerQ2 != null) {
                    putInt("selectedAnswerQ2", selectedAnswerQ2)
                }
                putInt("selectedAnswerQ3", responses[2])
            }

            println("responses: ${responses.joinToString()}")

            val intent= Intent(this, FourthQuestion::class.java)
            intent.putExtras(bundleAnswer3)
            startActivity(intent)
        }

        val radioAnswer1 = findViewById<RadioButton>(R.id.rb_question3_answer1)
        val radioAnswer2 = findViewById<RadioButton>(R.id.rb_question3_answer2)
        val radioAnswer3 = findViewById<RadioButton>(R.id.rb_question3_answer3)
        val radioAnswer4 = findViewById<RadioButton>(R.id.rb_question3_answer4)


        radioAnswer1.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer2.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer3.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer4.background = resources.getDrawable(R.drawable.custom_radiobutton)

    }
}