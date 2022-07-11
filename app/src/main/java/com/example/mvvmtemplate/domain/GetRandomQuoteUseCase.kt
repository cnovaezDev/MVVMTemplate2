package com.example.mvvmtemplate.domain

import com.example.mvvmtemplate.data.QuoteRepository
import com.example.mvvmtemplate.data.model.QuoteModel
import com.example.mvvmtemplate.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase  @Inject constructor(){

    private val repository = QuoteRepository()

    operator fun invoke():QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            /**
             * Equivalent
             */
            //val random = (quotes.indices).random()
            val random = (0..quotes.size-1).random()
            return quotes[random]
        }
        return null;
    }
}