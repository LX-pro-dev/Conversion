package com.gauthier.conversion.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var resultat = MutableLiveData<Float>()

    fun calcule() {
        fahrenheit.value?.let {
            resultat.value = (it.toFloat() - 32) * 5 / 9

        }
    }

    var fahrenheit = MutableLiveData<String>()
}