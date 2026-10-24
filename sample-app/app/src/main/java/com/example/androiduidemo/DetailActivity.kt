package com.example.androiduidemo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = findViewById<TextView>(R.id.detailTitle)
        val badge = findViewById<TextView>(R.id.detailBadge)
        val price = findViewById<TextView>(R.id.detailPrice)
        val addButton = findViewById<Button>(R.id.addToCartButton)
        val openSheetButton = findViewById<Button>(R.id.openSheetButton)

        title.post { UiAnimations.fadeIn(title, 500) }
        badge.post { UiAnimations.slideUp(badge, 700, 20f) }
        price.post { UiAnimations.slideUp(price, 850, 24f) }
        addButton.post { UiAnimations.fadeIn(addButton, 980) }

        addButton.setOnClickListener {
            UiAnimations.pulse(addButton)
        }

        openSheetButton.setOnClickListener {
            UiAnimations.pulse(openSheetButton)
            showBottomSheet()
        }
    }

    private fun showBottomSheet() {
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_example, null)
        val closeButton = view.findViewById<Button>(R.id.closeBottomSheet)

        closeButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.setContentView(view)
        dialog.show()
    }
}
