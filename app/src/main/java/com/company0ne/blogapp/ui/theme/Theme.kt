package com.company0ne.blogapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import com.company0ne.blogapp.ui.Purple200
import com.company0ne.blogapp.ui.Purple500
import com.company0ne.blogapp.ui.Purple700
import com.company0ne.blogapp.ui.Teal200




val DarkColorPalatte = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color.LightGray,
    surface = Color.Green
)

val LightColorPalatte = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color.Red,
    surface = Color.Cyan
)


@Composable
fun BlogAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {

    val colors = if (darkTheme) {
        DarkColorPalatte
    } else {
        LightColorPalatte
    }
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}