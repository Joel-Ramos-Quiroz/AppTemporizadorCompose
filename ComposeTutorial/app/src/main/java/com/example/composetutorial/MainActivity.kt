package com.example.composetutorial

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTutorialTheme {
                    Column( modifier = Modifier.verticalScroll(rememberScrollState()),
                    ) {
                        for (i in 1..30) {
                            val color = randomColor()
                            MessageCard("Android "+i,"Joel",Modifier.background(color))
                        }
                }
            }
        }
    }
}

fun randomColor(): Color {
    val random = Random(System.currentTimeMillis())
    return Color(
        red = random.nextFloat(),
        green = random.nextFloat(),
        blue = random.nextFloat()
    )
}

@Composable
fun MessageCard(name: String,autor: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(all = 20.dp)) {
        Image(
            painter = painterResource(R.drawable.logo_android),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                // Set image size to 40 dp
                //.size(40.dp)
                // Clip image to be shaped as a circle
                .size(40.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
        )

        // Add a horizontal space between the image and the column
        Spacer(modifier = Modifier.width(10.dp))

        Column {
            Text(text = name,
                color = MaterialTheme.colorScheme.secondary)
            // Add a vertical space between the author and message texts
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = autor,
                modifier = Modifier.padding(all = 4.dp),
                style = MaterialTheme.typography.bodySmall)
        }

    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    showSystemUi = true,
    name = "Dark Mode"
)

@Composable
fun PreviewMessageCard() {
    ComposeTutorialTheme {
            Column( modifier = Modifier.verticalScroll(rememberScrollState())){
                for (i in 1..30) {
                    val color = randomColor()
                    MessageCard("Android " + i, "Joel", Modifier.background(color))
                }
        }
    }
}