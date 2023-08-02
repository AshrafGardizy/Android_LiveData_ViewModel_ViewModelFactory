package com.example.livedataapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel (startNumber:Int) : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalSum:LiveData<Int>
        get() = total


    init {
        total.value = startNumber
    }

    fun sumUp(Input:Int)
    {
        total.value = (total.value)?.plus(Input)
    }
}