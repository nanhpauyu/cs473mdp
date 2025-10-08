package com.example.myapp.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CounterScreenViewModel : ViewModel() {
    private val _counterUIState = MutableStateFlow(
        CounterUIState(
            count = 0,
        )
    )
    val counterUIState = _counterUIState.asStateFlow()

    fun increment() {
        _counterUIState.update {
            it.copy(
                count = it.count + 1,
                errorMessage = null
            )
        }
    }

    fun decrement() {
        if (counterUIState.value.count == 0) {
            _counterUIState.update {
                it.copy(
                    errorMessage = "Cannot decrease below 0"
                )
            }
        } else {
            _counterUIState.update {
                it.copy(
                    count = it.count - 1,
                    errorMessage = null
                )
            }
        }

    }
}