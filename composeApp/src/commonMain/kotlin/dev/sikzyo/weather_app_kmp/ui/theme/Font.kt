package dev.sikzyo.weather_app_kmp.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import weatherappkmp.composeapp.generated.resources.Res
import weatherappkmp.composeapp.generated.resources.manrope_extra_light
import weatherappkmp.composeapp.generated.resources.manrope_light
import weatherappkmp.composeapp.generated.resources.manrope_regular
import weatherappkmp.composeapp.generated.resources.manrope_medium
import weatherappkmp.composeapp.generated.resources.manrope_semi_bold
import weatherappkmp.composeapp.generated.resources.manrope_bold
import weatherappkmp.composeapp.generated.resources.manrope_extra_bold
import weatherappkmp.composeapp.generated.resources.sora_thin
import weatherappkmp.composeapp.generated.resources.sora_extra_light
import weatherappkmp.composeapp.generated.resources.sora_light
import weatherappkmp.composeapp.generated.resources.sora_regular
import weatherappkmp.composeapp.generated.resources.sora_medium
import weatherappkmp.composeapp.generated.resources.sora_semi_bold
import weatherappkmp.composeapp.generated.resources.sora_bold
import weatherappkmp.composeapp.generated.resources.sora_extra_bold

@Composable
fun manropeFont() = FontFamily(
    Font(Res.font.manrope_extra_light, weight = FontWeight.ExtraLight),
    Font(Res.font.manrope_light, weight = FontWeight.Light),
    Font(Res.font.manrope_regular, weight = FontWeight.Normal),
    Font(Res.font.manrope_medium, weight = FontWeight.Medium),
    Font(Res.font.manrope_semi_bold, weight = FontWeight.SemiBold),
    Font(Res.font.manrope_bold, weight = FontWeight.Bold),
    Font(Res.font.manrope_extra_bold, weight = FontWeight.ExtraBold)
)

@Composable
fun soraFont()= FontFamily(
    Font(Res.font.sora_thin, weight = FontWeight.Thin),
    Font(Res.font.sora_extra_light, weight = FontWeight.ExtraLight),
    Font(Res.font.sora_light, weight = FontWeight.Light),
    Font(Res.font.sora_regular, weight = FontWeight.Normal),
    Font(Res.font.sora_medium, weight = FontWeight.Medium),
    Font(Res.font.sora_semi_bold, weight = FontWeight.SemiBold),
    Font(Res.font.sora_bold, weight = FontWeight.Bold),
    Font(Res.font.sora_extra_bold, weight = FontWeight.ExtraBold)

)
