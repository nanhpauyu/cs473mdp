package com.example.abc.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.example.abc.ui.theme.ABCTheme

@Composable
fun ABCScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
//        val abcViewModel: ABCViewModel = viewModel{
//            ABCViewModel(ABCRepositoryImpl())
//        }
        val abcViewModel: ABCViewModel = hiltViewModel()
        val abcDataState by abcViewModel.abcViewState.collectAsState()
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "${abcDataState.alphabet} - ${abcDataState.word}",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )
            Button(
                onClick = {
                    abcViewModel.nextABC()
                }
            ) {
//                Image(
//                    imageVector = Icons.Default.SkipNext,
//                    contentDescription = "Next"
//                )
                Text(
                    text = "Next"
                )
//                Image(
//                    imageVector = Icons.Default.SkipNext
//                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ABCScreenPreview(modifier: Modifier = Modifier) {
    ABCTheme {
        ABCScreen()
    }
}