package com.example.appcompose.ui.theme
// Define el paquete donde se encuentra este archivo, útil para la organización y el acceso a este archivo desde otros lugares de la aplicación.

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
// Importa clases necesarias de Jetpack Compose para definir unidades de medida (Dp) y dimensiones en dp (density-independent pixels).

// Define una clase de datos (data class) llamada Dimens que contiene varias propiedades para las dimensiones comunes en la interfaz de usuario.
data class Dimens(
    val borderNormal: Dp = 4.dp,               // Grosor de borde estándar (4 dp)
    val buttonHeightNormal: Dp = 56.dp,        // Altura estándar de botones (56 dp)
    val iconSizeSmall: Dp = 24.dp,             // Tamaño pequeño de iconos (24 dp)
    val iconSizeNormal: Dp = 36.dp,            // Tamaño normal de iconos (36 dp)
    val paddingSmall: Dp = 4.dp,               // Espaciado pequeño (4 dp)
    val paddingNormal: Dp = 8.dp,              // Espaciado normal (8 dp)
    val paddingMedium: Dp = 16.dp,             // Espaciado medio (16 dp)
    val roundedShapeNormal: Dp = 8.dp,         // Radio de esquinas redondeadas normal (8 dp)
    val spacerSmall: Dp = 4.dp,                // Espaciador pequeño (4 dp)
    val spacerNormal: Dp = 8.dp,               // Espaciador normal (8 dp)
    val spacerMedium: Dp = 16.dp,              // Espaciador medio (16 dp)
    val spacerLarge: Dp = 40.dp,               // Espaciador grande (40 dp)
)

// Crea una instancia por defecto de Dimens con las dimensiones definidas anteriormente.
val DefaultDimens = Dimens()

// Crea otra instancia de Dimens, llamada TabletDimens, para dispositivos tipo tablet con dimensiones específicas para estos dispositivos.
val TabletDimens = Dimens(
    buttonHeightNormal = 64.dp,                // Altura estándar de botones para tablets (64 dp)
    iconSizeSmall = 36.dp,                     // Tamaño pequeño de iconos para tablets (36 dp)
    iconSizeNormal = 48.dp,                    // Tamaño normal de iconos para tablets (48 dp)
    paddingSmall = 8.dp,                       // Espaciado pequeño para tablets (8 dp)
    paddingNormal = 16.dp,                     // Espaciado normal para tablets (16 dp)
    paddingMedium = 24.dp,                     // Espaciado medio para tablets (24 dp)
    roundedShapeNormal = 16.dp,                // Radio de esquinas redondeadas normal para tablets (16 dp)
    spacerSmall = 8.dp,                        // Espaciador pequeño para tablets (8 dp)
    spacerNormal = 16.dp,                      // Espaciador normal para tablets (16 dp)
    spacerMedium = 24.dp,                      // Espaciador medio para tablets (24 dp)
    spacerLarge = 56.dp                        // Espaciador grande para tablets (56 dp)
)
