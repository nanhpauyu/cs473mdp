package com.example.abc.data

public class FakeRepo(
    abc: List<Pair<Char, String>> = listOf(
        'A' to "Apple",
        'B' to "Ball",
        'C' to "Cat",
    )
) : ABCRepository by ABCRepositoryImpl(abc)