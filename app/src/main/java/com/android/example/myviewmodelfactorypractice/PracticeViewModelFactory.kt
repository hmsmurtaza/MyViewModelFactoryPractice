package com.android.example.myviewmodelfactorypractice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class PracticeViewModelFactory(val counter: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  PracticeViewModel(counter) as T   // super.create(modelClass)
    }
}