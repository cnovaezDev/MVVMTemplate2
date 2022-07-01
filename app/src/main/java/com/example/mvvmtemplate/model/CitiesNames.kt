package com.example.mvvmtemplate.model

import androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.instance

enum class CitiesNames {
   LONDON, MOSCOW, PARIS, NEWYORK;

    fun getName(): String{
        return when(this) {
            LONDON -> "London"
            MOSCOW -> "Moscow"
            PARIS -> "Paris"
            NEWYORK -> "New York"
        }
    }
}