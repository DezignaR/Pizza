package com.example.pizza.ui.theme

import androidx.compose.ui.graphics.Color

data class Colors (
    val primaryBackground:Color,
    val secondaryBackground: Color,
    val headerTextColor:Color,
    val primaryTextColor:Color,
    val primaryTextInvertColor:Color,
    val primaryTintColor:Color,
    val secondaryTintColor:Color,
    val hintTextColor:Color,
    val accentColor: Color,
    val notificationColor:Color
        )
val lightPalette = Colors(
    primaryBackground = Color.White,
    secondaryBackground = Color(0xFFD0CCC7),
    primaryTextColor = Color(0xFF59442B),
    headerTextColor = Color(0xFF311F09),
    primaryTextInvertColor = Color.White,
    primaryTintColor = Color(0xFFFF8A00),
    secondaryTintColor = Color(0xFF3FA72F),
    hintTextColor = Color(0xFFA0978C),
    accentColor = Color(0xFF8aEAFF),
    notificationColor = Color(0xFFFF3838)
)