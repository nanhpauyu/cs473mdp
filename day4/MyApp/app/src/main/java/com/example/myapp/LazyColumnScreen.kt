package com.example.myapp


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.data.DataSource

@Composable
fun LazyColumnScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding((innerPadding))
        ) {
//            item {
//                Text(
//                    text = "MIU"
//                )
//            }
            items(
                DataSource.loadData()
            ) {
                Column {
                    Card {
                        Image(
                            painter = painterResource(it.image),
                            contentDescription = stringResource(it.title),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = stringResource(it.title)
                        )
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
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
fun LazyColumnScreenPreview(modifier: Modifier = Modifier) {
    LazyColumnScreen()
}