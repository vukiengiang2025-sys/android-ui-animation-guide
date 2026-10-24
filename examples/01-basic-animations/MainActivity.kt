package com.example.basicanimations

import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.titleText)
        val button = findViewById<Button>(R.id.animateButton)

        title.alpha = 0f
        ObjectAnimator.ofFloat(title, "alpha", 0f, 1f).apply {
            duration = 700
            start()
        }

        button.setOnClickListener {
            ObjectAnimator.ofFloat(button, "scaleX", 1f, 0.95f, 1f).apply {
                duration = 200
                start()
            }

            ObjectAnimator.ofFloat(button, "scaleY", 1f, 0.95f, 1f).apply {
                duration = 200
                start()
            }

            ObjectAnimator.ofFloat(button, "translationY", 0f, -8f, 0f).apply {
                duration = 250
                start()
            }
        }
    }
}
