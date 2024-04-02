package com.android.example.myviewmodelfactorypractice

import androidx.lifecycle.ViewModel

class PracticeViewModel(initialise: Int): ViewModel() {
    private var count = initialise
    fun increment() {
         count++
    }
    fun getCountOfIncrement(): Int {
        return count
    }
}