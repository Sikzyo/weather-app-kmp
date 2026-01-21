package dev.sikzyo.weather_app_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform