package com.example.androiduidemo

import android.animation.ObjectAnimator
import android.view.View

object UiAnimations {
    fun fadeIn(view: View, duration: Long = 500L) {
        view.alpha = 0f
        ObjectAnimator.ofFloat(view, View.ALPHA, 0f, 1f).apply {
            this.duration = duration
            start()
        }
    }

    fun slideUp(view: View, duration: Long = 500L, offset: Float = 40f) {
        view.translationY = offset
        view.alpha = 0f
        ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, offset, 0f).apply {
            this.duration = duration
            start()
        }
        ObjectAnimator.ofFloat(view, View.ALPHA, 0f, 1f).apply {
            this.duration = duration
            start()
        }
    }

    fun pulse(view: View, duration: Long = 180L) {
        val scaleX = ObjectAnimator.ofFloat(view, View.SCALE_X, 1f, 0.96f, 1f)
        val scaleY = ObjectAnimator.ofFloat(view, View.SCALE_Y, 1f, 0.96f, 1f)
        scaleX.duration = duration
        scaleY.duration = duration
        scaleX.start()
        scaleY.start()
    }
}
