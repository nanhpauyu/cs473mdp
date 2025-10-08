package com.example.abc.ui

data class ABCDataState(
    val alphabet: Char,
    val word: String,
    val isCompleted: Boolean = false,
    val isLoading: Boolean = false,
    val isError: String? = null
)
