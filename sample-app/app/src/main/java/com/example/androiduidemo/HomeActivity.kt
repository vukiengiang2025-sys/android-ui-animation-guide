package com.example.androiduidemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val title = findViewById<TextView>(R.id.homeTitle)
        val summaryCard = findViewById<LinearLayout>(R.id.summaryCard)
        val feature1 = findViewById<LinearLayout>(R.id.featureCard1)
        val feature2 = findViewById<LinearLayout>(R.id.featureCard2)
        val detailButton = findViewById<Button>(R.id.openDetailButton)

        title.post { UiAnimations.fadeIn(title, 500) }
        summaryCard.post { UiAnimations.slideUp(summaryCard, 700, 50f) }
        feature1.post { UiAnimations.slideUp(feature1, 850, 65f) }
        feature2.post { UiAnimations.slideUp(feature2, 980, 80f) }

        detailButton.setOnClickListener {
            UiAnimations.pulse(detailButton)
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
