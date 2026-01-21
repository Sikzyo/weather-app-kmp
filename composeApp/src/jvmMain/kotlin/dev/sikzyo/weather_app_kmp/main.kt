package dev.sikzyo.weather_app_kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Weatherappkmp",
    ) {
        App()
    }
}