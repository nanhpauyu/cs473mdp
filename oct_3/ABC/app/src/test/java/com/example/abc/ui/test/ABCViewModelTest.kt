package com.example.abc.ui.test

import com.example.abc.data.FakeRepo
import com.example.abc.ui.ABCViewModel
import org.junit.Before
import org.junit.Test

class ABCViewModelTest {
    private lateinit var viewModel: ABCViewModel

    @Before
    fun setup(){
        viewModel = ABCViewModel(FakeRepo())
    }

    @Test
    fun testInitialUIState(){
        val uiState = viewModel.abcViewState.value
        assert(uiState.alphabet == 'A')
        assert(uiState.word == "Apple")
        assert(!uiState.isCompleted)
    }

    @Test
    fun testNextABC(){
        viewModel.nextABC()
        val uiState = viewModel.abcViewState.value
        assert(uiState.alphabet == 'B')
        assert(uiState.word == "Ball")
        assert(!uiState.isCompleted)
    }

    @Test
    fun testNextABCCompleted(){
        repeat(2){
            viewModel.nextABC()
        }
        val uiState = viewModel.abcViewState.value
        assert(uiState.alphabet == 'C')
        assert(uiState.word == "Cat")
        assert(uiState.isCompleted)
    }
}