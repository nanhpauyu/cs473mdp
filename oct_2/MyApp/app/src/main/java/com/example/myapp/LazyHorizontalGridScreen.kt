package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp.data.DataSource

@Composable
fun LazyHorizontalGridScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        LazyHorizontalGrid(
            rows = GridCells.Adaptive(minSize = 196.dp),
            modifier = Modifier
                .padding(innerPadding)
        ) {
            items(DataSource.loadData()) {
                Image(
                    painter = painterResource(it.image),
                    contentDescription = stringResource(it.title),
                    modifier = Modifier
                        .aspectRatio(2f),
                    contentScale = ContentScale.Crop
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
fun LazyHorizontalGridScreenPreview(modifier: Modifier = Modifier) {
    LazyHorizontalGridScreen()
}