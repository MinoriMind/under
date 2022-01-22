package com.example.final02.ui.ois

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OisViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Ois. Or Technoblade... Nobody rly knows..."
    }
    val text: LiveData<String> = _text
}