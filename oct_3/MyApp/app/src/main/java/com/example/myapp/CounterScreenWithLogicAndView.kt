package com.example.myapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreenWithLogicAndView(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            var count by rememberSaveable { mutableIntStateOf(0)  }
            Text(
                text = "$count",
                fontSize = 50.sp
            )
            Row {
                Button(
                    onClick = {
//                        increment(count)
                        count = increment(count)
                    }
                ) {
                    Text(
                        text = "+",
                        fontSize = 30.sp
                    )
                }
                Spacer(
                    modifier = Modifier
                        .padding(all = 20.dp))
                Button(
                    onClick = {
                        count = decrement(count)
                    }
                ) {
                    Text(
                        text = "-",
                        fontSize = 30.sp
                    )
                }
            }
        }
    }
}
fun increment(count:Int) = count + 1
fun decrement(count:Int):Int {
    if (count > 0){
        return count - 1
    }
    return 0
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CounterScreenWithLogicAndViewPreview(modifier: Modifier = Modifier) {
    CounterScreenWithLogicAndView()
}