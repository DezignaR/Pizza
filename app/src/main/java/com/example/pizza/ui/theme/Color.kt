package com.example.pizza.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors (
    val primaryBackground:Color,
    val secondaryBackground: Color,
    val headerTextColor:Color,
    val primaryTextColor:Color
        )
val lightPalette = Colors(
    primaryBackground = Color.White,
    secondaryBackground = Color(0xFFD0CCC7),
    primaryTextColor = Color(0xFF59442B),
    headerTextColor = Color(0xFF311F09)
)