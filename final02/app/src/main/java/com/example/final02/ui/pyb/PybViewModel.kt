package com.example.final02.ui.pyb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PybViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Pyb. Also known as tommy. He likes wives."
    }
    val text: LiveData<String> = _text
}