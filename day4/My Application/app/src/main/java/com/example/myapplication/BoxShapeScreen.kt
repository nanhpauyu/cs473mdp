package com.example.myapplication

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxShapeScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CircleShape
                    )
                    .size(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Welcome"
                )
            }
            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .size(200.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = "Welcome"
                )
            }
            Box (
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CutCornerShape(20.dp)
                    )
                    .size(200.dp),
                contentAlignment = Alignment.TopCenter
            ){
                Text(
                    text = "Welcome"
                )
            }
            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CircleShape
                    )
                    .size(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Welcome"
                )
            }
            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .size(200.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    text = "Welcome"
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BoxShapeScreenPreview(modifier: Modifier = Modifier) {
    BoxShapeScreen()

}