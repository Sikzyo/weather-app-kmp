package dev.sikzyo.weather_app_kmp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import dev.sikzyo.weather_app_kmp.ui.screens.HomeScreen


@Composable
@Preview
fun App() {
    MaterialTheme {
        HomeScreen()
    }
}