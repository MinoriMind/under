package com.example.fragmentmenu.ui.bed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications"
    }
    val text: LiveData<String> = _text
}