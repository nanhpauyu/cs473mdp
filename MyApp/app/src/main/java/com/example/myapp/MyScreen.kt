package com.example.myapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Row(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.LightGray),
//            horizontalArrangement = Arrangement.spacedBy(50.dp),
//            verticalAlignment = Alignment.Top
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = "MIU",
                color = Color.Blue,
                modifier = Modifier
                .weight(1f)
            )
            Text(
                text = "Fairfield",
                color = Color.Yellow,
                modifier = Modifier
                    .weight(1f)
            )
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun MyScreenPreview(modifier: Modifier = Modifier) {
    MyScreen()
}