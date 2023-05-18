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

            if (selectedAnswerQ1 != null) {
                responses[0] = selectedAnswerQ1
            }
            if (selectedAnswerQ2 != null) {
                responses[1] = selectedAnswerQ2
            }
            if (selectedAnswerQ3 != null) {
                responses[2] = selectedAnswerQ3
            }
            if (radioButtonId4 != -1) {
                val radioButton4 = findViewById<RadioButton>(radioButtonId4)
                val index4 = radioGroup4.indexOfChild(radioButton4)
                responses[3] = index4 + 1
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