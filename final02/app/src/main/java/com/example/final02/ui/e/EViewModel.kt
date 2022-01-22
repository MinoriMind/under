package com.example.final02.ui.e

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is E"
    }
    val text: LiveData<String> = _text
}