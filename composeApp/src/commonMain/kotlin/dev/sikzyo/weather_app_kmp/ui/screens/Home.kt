package dev.sikzyo.weather_app_kmp.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .safeContentPadding()
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,) {
        Text("Pantalla principal")
    }
}