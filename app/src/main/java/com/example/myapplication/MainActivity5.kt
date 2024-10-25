package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBarsInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.updatePadding(
                left = systemBarsInsets.left,
                top = systemBarsInsets.top,
                right = systemBarsInsets.right,
                bottom = systemBarsInsets.bottom
            )
            insets
        }

        val signInText = findViewById<TextView>(R.id.textViewSignInPrompt)
        signInText.setOnClickListener {
            goToSignIn(it)
        }
    }

    fun goToSignIn(view: View) {
        val intent = Intent(this@MainActivity5, MainActivity4::class.java)
        startActivity(intent)
    }
}