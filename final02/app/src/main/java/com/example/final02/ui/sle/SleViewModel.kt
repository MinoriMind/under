package com.example.final02.ui.sle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SleViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Sle. Also known as Philza Mincraft. He is old."
    }
    val text: LiveData<String> = _text
}