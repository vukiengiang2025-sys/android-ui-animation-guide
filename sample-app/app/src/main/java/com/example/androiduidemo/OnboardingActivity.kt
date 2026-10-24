package com.example.androiduidemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val title = findViewById<TextView>(R.id.onboardingTitle)
        val desc = findViewById<TextView>(R.id.onboardingDescription)
        val button = findViewById<Button>(R.id.getStartedButton)

        title.post { UiAnimations.fadeIn(title, 500) }
        desc.post { UiAnimations.slideUp(desc, 650) }
        button.post { UiAnimations.slideUp(button, 720) }

        button.setOnClickListener {
            UiAnimations.pulse(button)
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}
