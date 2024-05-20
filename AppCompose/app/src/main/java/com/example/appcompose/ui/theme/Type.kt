package com.example.appcompose.ui.theme
// Define el paquete donde se encuentra este archivo, útil para la organización y el acceso a este archivo desde otros lugares de la aplicación.

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.appcompose.R
// Importa las clases necesarias de Jetpack Compose y Android para definir estilos de texto y familias de fuentes,
// así como los recursos de fuentes desde el archivo R (recursos de la aplicación).

// Define una familia de fuentes personalizada llamada PoppinsFont que incluye varias variantes de la fuente Poppins
val PoppinsFont = FontFamily(
    Font(R.font.poppins_bold, FontWeight.Bold),            // Fuente Poppins en negrita
    Font(R.font.poppins_medium, FontWeight.SemiBold),      // Fuente Poppins semi negrita
    Font(R.font.poppins_regular, FontWeight.Normal),       // Fuente Poppins regular
    Font(R.font.poppins_light, FontWeight.Light)           // Fuente Poppins ligera
)

// Define un conjunto de estilos tipográficos usando Material Design y la familia de fuentes Poppins
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = PoppinsFont,                          // Utiliza la familia de fuentes Poppins
        fontWeight = FontWeight.Normal,                    // Peso de fuente normal
        fontSize = 88.sp,                                  // Tamaño de fuente grande (88 sp)
        lineHeight = 0.sp,                                 // Altura de línea (0 sp, probablemente personalizada más adelante)
        letterSpacing = 0.5.sp                             // Espaciado entre letras (0.5 sp)
    ),
    displayMedium = TextStyle(
        fontFamily = PoppinsFont,                          // Utiliza la familia de fuentes Poppins
        fontWeight = FontWeight.Bold,                      // Peso de fuente negrita
        fontSize = 56.sp,                                  // Tamaño de fuente mediano (56 sp)
        lineHeight = 24.sp,                                // Altura de línea (24 sp)
        letterSpacing = 0.5.sp                             // Espaciado entre letras (0.5 sp)
    ),
    bodyLarge = TextStyle(
        fontFamily = PoppinsFont,                          // Utiliza la familia de fuentes Poppins
        fontWeight = FontWeight.SemiBold,                  // Peso de fuente semi negrita
        fontSize = 16.sp,                                  // Tamaño de fuente grande para cuerpo de texto (16 sp)
        lineHeight = 20.sp,                                // Altura de línea (20 sp)
        letterSpacing = 0.5.sp,                            // Espaciado entre letras (0.5 sp)
        textAlign = TextAlign.Center                       // Texto centrado
    ),
    bodyMedium = TextStyle(
        fontFamily = PoppinsFont,                          // Utiliza la familia de fuentes Poppins
        fontWeight = FontWeight.Medium,                    // Peso de fuente medio
        fontSize = 12.sp,                                  // Tamaño de fuente mediano para cuerpo de texto (12 sp)
        lineHeight = 16.sp,                                // Altura de línea (16 sp)
        letterSpacing = 0.5.sp,                            // Espaciado entre letras (0.5 sp)
        textAlign = TextAlign.Center                       // Texto centrado
    )
    // Otros estilos de texto predeterminados que se pueden sobrescribir si es necesario
    /*
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,                   // Utiliza la familia de fuentes por defecto
        fontWeight = FontWeight.Normal,                    // Peso de fuente normal
        fontSize = 22.sp,                                  // Tamaño de fuente grande para títulos (22 sp)
        lineHeight = 28.sp,                                // Altura de línea (28 sp)
        letterSpacing = 0.sp                               // Sin espaciado entre letras adicional
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,                   // Utiliza la familia de fuentes por defecto
        fontWeight = FontWeight.Medium,                    // Peso de fuente medio
        fontSize = 11.sp,                                  // Tamaño de fuente pequeño para etiquetas (11 sp)
        lineHeight = 16.sp,                                // Altura de línea (16 sp)
        letterSpacing = 0.5.sp                             // Espaciado entre letras (0.5 sp)
    )
    */
)
