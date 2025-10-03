package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextStyleScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            Text(
                text = "This is Android",
                color = Color.Red,
                fontFamily = FontFamily.Cursive,
//                textDecoration = TextDecoration.Underline,
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 50.sp,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color(0xff1c862a),
//                        blurRadius = 30f,
                        offset = Offset(
                            x = 20f,
                            y = 5f
                        )
                    )
                )
            )
            Text(
                text = "Compose is really fun",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Black,
                        blurRadius = 30f,
                    ),
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Green,
                            Color.Yellow,
                            Color.Blue,
                            Color.Black
                        )
                    )
                )
            )
        }
    }
}


@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun TextStyleScreenPreview(modifier: Modifier = Modifier) {
    TextStyleScreen()
}