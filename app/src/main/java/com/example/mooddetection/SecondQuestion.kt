package com.example.mooddetection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class SecondQuestion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_question)
        val button = findViewById<Button>(R.id.btn_submit)
        //Bundling passed from previous Views

        val selectedAnswerQ1 = intent.extras?.getInt("selectedAnswerQ1")


        button.setOnClickListener{
            val responses = IntArray(4)

            val radioGroup2 = findViewById<RadioGroup>(R.id.rg_question2)
            val radioButtonId2 = radioGroup2.checkedRadioButtonId
            if (radioButtonId2 != -1) {
                val radioButton2 = findViewById<RadioButton>(radioButtonId2)
                val index2 = radioGroup2.indexOfChild(radioButton2)
                responses[1] = index2 + 1
            }

            //Bundling

            val bundleAnswer2 = Bundle().apply {
                if (selectedAnswerQ1 != null) {
                    putInt("selectedAnswerQ1", selectedAnswerQ1)
                }
                putInt("selectedAnswerQ2", responses[1])
            }

            val intent= Intent(this, ThirdQuestion::class.java)
            intent.putExtras(bundleAnswer2)
            startActivity(intent)
        }

        val radioAnswer1 = findViewById<RadioButton>(R.id.rb_question2_answer1)
        val radioAnswer2 = findViewById<RadioButton>(R.id.rb_question2_answer2)
        val radioAnswer3 = findViewById<RadioButton>(R.id.rb_question2_answer3)
        val radioAnswer4 = findViewById<RadioButton>(R.id.rb_question2_answer4)



        radioAnswer1.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer2.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer3.background = resources.getDrawable(R.drawable.custom_radiobutton)
        radioAnswer4.background = resources.getDrawable(R.drawable.custom_radiobutton)

    }
}