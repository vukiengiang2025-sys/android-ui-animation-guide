package com.example.composeanimations

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedSampleScreen() {
    var visible by remember { mutableStateOf(true) }

    Column(modifier = Modifier.padding(24.dp)) {
        Button(onClick = { visible = !visible }) {
            Text("Toggle")
        }

        AnimatedVisibility(
            visible = visible,
            enter = fadeIn(animationSpec = tween(500)) + slideInVertically(initialOffsetY = { 30 }),
            exit = fadeOut(animationSpec = tween(300)) + slideOutVertically(targetOffsetY = { 30 })
        ) {
            Text("Hello from Compose animation")
        }
    }
}
