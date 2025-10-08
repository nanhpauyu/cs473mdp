package com.example.abc.data

class ABCRepositoryImpl(
    private val abcData: List<Pair<Char, String>> = ABCData.abcData
) : ABCRepository {
    override fun getABCData(): List<Pair<Char, String>> = abcData

    override fun getNextABC(currentABC: Pair<Char, String>): Pair<Char, String> {
        val abcData = getABCData()
        val n = abcData.size
        val currentIndex = abcData.indexOf(currentABC)
        val nextIndex = (currentIndex + 1) % n
        return abcData[nextIndex]
    }
}