package com.example.appcompose.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.appcompose.presentation.theme.AppComposeTheme

@Composable
fun AutoResizedText(
    modifier: Modifier = Modifier, // Se permite pasar un modificador opcional para personalizar el componente desde fuera.
    text: String, // El texto que se va a mostrar.
    textStyle: TextStyle = MaterialTheme.typography.displayLarge, // Estilo de texto predeterminado.
) {
    // Variable mutable que almacena el estilo del texto, inicializada con el estilo proporcionado.
    var timeTextStyle by remember { mutableStateOf(textStyle) }

    // Factor de reducción del tamaño de la fuente para cada iteración de ajuste.
    val fontSizeFactor = 0.95

    // Composable Text que renderiza el texto.
    Text(
        text,
        modifier = Modifier.fillMaxSize().background(Color.Red), // Se expande para llenar el espacio disponible.
        softWrap = false, // No se permite el ajuste de línea automático.
        style = timeTextStyle, // Aplica el estilo actual del texto.

        // Callback que se llama después de que el texto se haya dispuesto (layout).
        onTextLayout = { result ->
            // Si el texto desborda el ancho disponible...
            if (result.didOverflowWidth) {
                // Ajusta el estilo del texto reduciendo el tamaño de la fuente.
                timeTextStyle = timeTextStyle.copy(
                    fontSize = timeTextStyle.fontSize * fontSizeFactor
                )
            }
        }
    )
}

@Preview(
    name = "AutoResizedText",
    showBackground = true,
)

@Composable

fun AutoResizedTextPreviw(){
    AppComposeTheme{
        AutoResizedText(
            text="Focus Timer"
            )
    }
}