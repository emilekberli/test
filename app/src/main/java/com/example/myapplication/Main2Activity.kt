package com.example.myapplication

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val welcomeButton = findViewById<Button>(R.id.welcomeButton)
        val textViewLearn = findViewById<TextView>(R.id.textViewLearn)
        val textViewGoals = findViewById<TextView>(R.id.textViewGoals)

        welcomeButton.alpha = 0f
        textViewLearn.alpha = 0f
        textViewGoals.alpha = 0f

        Handler(Looper.getMainLooper()).postDelayed({
            fadeInView(textViewLearn)
            fadeInView(textViewGoals)
            fadeInView(welcomeButton)
        }, 3000)

        welcomeButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun fadeInView(view: android.view.View) {
        val fadeIn = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)
        fadeIn.duration = 1500
        fadeIn.start()
    }
}