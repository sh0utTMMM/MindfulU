package com.example.mooddetection

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class DailyCheck : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daily_check)

        val circles = arrayOf(
            findViewById<RelativeLayout>(R.id.circle1),
            findViewById<RelativeLayout>(R.id.circle2),
            findViewById<RelativeLayout>(R.id.circle3),
            findViewById<RelativeLayout>(R.id.circle4)
        )

        for (circle in circles) {
            circle.setOnClickListener {
                for (c in circles) {
                    c.setBackgroundResource(R.drawable.circle_white)
                }
                circle.setBackgroundResource(R.drawable.circle_purple)
            }
        }
    }
}
