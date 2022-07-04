package com.example.mvvmtemplate.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmtemplate.model.QuoteModel
import com.example.mvvmtemplate.model.QuoteProvider

class QuoteViewModel: ViewModel() {

    val quoteModel= MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random();
        quoteModel.postValue(currentQuote);
    }
}