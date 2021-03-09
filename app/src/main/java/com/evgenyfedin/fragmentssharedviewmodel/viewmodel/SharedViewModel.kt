package com.evgenyfedin.fragmentssharedviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _text: MutableLiveData<CharSequence> = MutableLiveData()
    val text: LiveData<CharSequence> = _text

    fun setText(input: CharSequence) {
        _text.postValue(input)
    }

}