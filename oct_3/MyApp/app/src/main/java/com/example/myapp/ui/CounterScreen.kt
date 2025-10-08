package com.example.myapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapp.decrement
import com.example.myapp.increment
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val counterViewModel: CounterScreenViewModel = viewModel()
            val counterUIState by counterViewModel.counterUIState.collectAsState()

            Text(
                text = "${counterUIState.count}",
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Row {
                Button(
                    onClick = {
                        counterViewModel.increment()
                    }
                ) {
                    Text(
                        text = "+",
                        fontSize = 30.sp
                    )
                }
                Spacer(modifier = Modifier.padding(10.dp))
                Button(
                    onClick = {
                        counterViewModel.decrement()
                    }
                ) {
                    Text(
                        text = "-",
                        fontSize = 30.sp
                    )
                }
            }
            when {
                counterUIState.isLoading -> {
                    CircularProgressIndicator()
                }

                counterUIState.isCompleted -> {
                    Text(
                        text = "Completed"
                    )
                }

                counterUIState.errorMessage != null -> {
                    Text(
                        text = counterUIState.errorMessage!!,
                        color = Color.Red
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CounterScreenPreview(modifier: Modifier = Modifier) {
    CounterScreen()
}