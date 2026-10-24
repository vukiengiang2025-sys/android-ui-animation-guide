package com.example.androiduidemo.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF5A6CF5),
    onPrimary = androidx.compose.ui.graphics.Color.White,
    secondary = androidx.compose.ui.graphics.Color(0xFF8AA6FF),
    background = androidx.compose.ui.graphics.Color(0xFFF5F7FF),
    surface = androidx.compose.ui.graphics.Color.White,
    onSurface = androidx.compose.ui.graphics.Color(0xFF111827),
    error = androidx.compose.ui.graphics.Color(0xFFB3261E)
)

private val DarkColors = darkColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF9AA9FF),
    onPrimary = androidx.compose.ui.graphics.Color.Black,
    secondary = androidx.compose.ui.graphics.Color(0xFF7590FF),
    background = androidx.compose.ui.graphics.Color(0xFF101827),
    surface = androidx.compose.ui.graphics.Color(0xFF1F2937),
    onSurface = androidx.compose.ui.graphics.Color(0xFFF9FAFB),
    error = androidx.compose.ui.graphics.Color(0xFFCF6679)
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
