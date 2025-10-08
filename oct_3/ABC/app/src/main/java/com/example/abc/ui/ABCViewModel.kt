package com.example.abc.ui

import androidx.lifecycle.ViewModel
import com.example.abc.data.ABCRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ABCViewModel @Inject constructor(
    private val abcRepository: ABCRepository
) : ViewModel() {
    //    private val abcData = ABCData.abcData
    private val abcData = abcRepository.getABCData()
    private val _abcViewState = MutableStateFlow(
        ABCDataState(
            alphabet = abcData[0].first,
            word = abcData[0].second
        )
    )
    val abcViewState = _abcViewState.asStateFlow()

    fun nextABC() {
        val nextABC =
            abcRepository.getNextABC(
                _abcViewState.value.alphabet to _abcViewState.value.word
            )
        if (nextABC == abcData.last()) {
            _abcViewState.update {
                it.copy(
                    alphabet = nextABC.first,
                    word = nextABC.second,
                    isCompleted = true
                )
            }
        } else {
            _abcViewState.update {
                it.copy(
                    alphabet = nextABC.first,
                    word = nextABC.second,
                    isCompleted = false
                )
            }
        }
//        var currentIndex = abcData.indexOfFirst {
//            it.first == _abcViewState.value.alphabet
//        }
//        val nextIndex = (currentIndex + 1) % abcData.size
//        _abcViewState.update {
//            it.copy(
//                alphabet = abcData[nextIndex].first,
//                word = abcData[nextIndex].second,
//            )
//        }
    }
}