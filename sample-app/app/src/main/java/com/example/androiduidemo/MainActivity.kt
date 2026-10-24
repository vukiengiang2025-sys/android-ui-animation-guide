package com.example.androiduidemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.androiduidemo.ui.theme.AppTheme
import com.example.androiduidemo.ui.screens.DemoApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                DemoApp()
            }
        }
    }
}
