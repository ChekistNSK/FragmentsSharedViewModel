package com.evgenyfedin.fragmentssharedviewmodel.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val text: MutableLiveData<CharSequence> = MutableLiveData()

    fun setText(input: CharSequence) {
        text.postValue(input)
    }

    fun getText(): MutableLiveData<CharSequence> {
        return text
    }

}