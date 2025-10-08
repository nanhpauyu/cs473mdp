package com.example.myapp.ui

data class CounterUIState(
    val count: Int,
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val isCompleted: Boolean = false
)
