package com.example.androiduidemo

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        val title = findViewById<android.widget.TextView>(R.id.titleText)
        val ctaButton = findViewById<android.widget.Button>(R.id.ctaButton)
        val card = findViewById<androidx.cardview.widget.CardView>(R.id.featureCard)

        title.alpha = 0f
        card.alpha = 0f
        card.translationY = 30f

        ObjectAnimator.ofFloat(title, "alpha", 0f, 1f).apply {
            duration = 700
            start()
        }

        ObjectAnimator.ofFloat(card, "alpha", 0f, 1f).apply {
            duration = 900
            start()
        }

        ObjectAnimator.ofFloat(card, "translationY", 30f, 0f).apply {
            duration = 800
            start()
        }

        ctaButton.setOnClickListener {
            ObjectAnimator.ofFloat(ctaButton, "scaleX", 1f, 0.96f, 1f).apply {
                duration = 180
                start()
            }

            ObjectAnimator.ofFloat(ctaButton, "scaleY", 1f, 0.96f, 1f).apply {
                duration = 180
                start()
            }

            ObjectAnimator.ofFloat(ctaButton, "translationY", 0f, -8f, 0f).apply {
                duration = 220
                start()
            }

            motionLayout.transitionToEnd()
        }
    }
}
