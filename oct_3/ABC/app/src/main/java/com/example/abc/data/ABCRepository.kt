package com.example.abc.data

interface ABCRepository {
    fun getABCData(): List<Pair<Char, String>>
    fun getNextABC(currentABC: Pair<Char, String>): Pair<Char, String>
}