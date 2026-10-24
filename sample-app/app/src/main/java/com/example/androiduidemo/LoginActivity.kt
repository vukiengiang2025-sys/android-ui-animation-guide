package com.example.androiduidemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val title = findViewById<TextView>(R.id.loginTitle)
        val subtitle = findViewById<TextView>(R.id.loginSubtitle)
        val emailInput = findViewById<android.widget.EditText>(R.id.emailInput)
        val passwordInput = findViewById<android.widget.EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val secondaryButton = findViewById<Button>(R.id.secondaryButton)

        title.post { UiAnimations.fadeIn(title, 600) }
        subtitle.post { UiAnimations.slideUp(subtitle, 700) }
        emailInput.post { UiAnimations.slideUp(emailInput, 800) }
        passwordInput.post { UiAnimations.slideUp(passwordInput, 900) }
        loginButton.post { UiAnimations.fadeIn(loginButton, 1000) }

        loginButton.setOnClickListener {
            UiAnimations.pulse(loginButton)
            startActivity(Intent(this, HomeActivity::class.java))
        }

        secondaryButton.setOnClickListener {
            startActivity(Intent(this, OnboardingActivity::class.java))
        }
    }
}
