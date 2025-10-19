package com.hieu10.casiocalc.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = ColorPrimary,
    onPrimary = Color.Black,
    primaryContainer = ColorPrimaryContainer,
    onPrimaryContainer = Color.White,
    secondary = ColorSecondary,
    onSecondary = Color.Black,
    secondaryContainer = ColorSecondaryContainerDark,
    onSecondaryContainer = Color.White,
    tertiary = ColorTertiary,
    onTertiary = Color.Black,
    background = ColorBackgroundDark,
    onBackground = Color.White,
    surface = ColorSurfaceDark,
    onSurface = Color.White,
    error = ColorErrorDark,
    onError = Color.Black
)

private val LightColorScheme = lightColorScheme(
    primary = ColorPrimary,
    onPrimary = Color.Black,
    primaryContainer = ColorPrimaryContainer,
    onPrimaryContainer = Color.White,
    secondary = ColorSecondary,
    onSecondary = Color.Black,
    secondaryContainer = ColorSecondaryContainerLight,
    onSecondaryContainer = Color.White,
    tertiary = ColorTertiary,
    onTertiary = Color.Black,
    background = ColorBackgroundLight,
    onBackground = Color.White,
    error = ColorErrorLight,
    onError = Color.Black
)

@Composable
fun CasioCalcTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}