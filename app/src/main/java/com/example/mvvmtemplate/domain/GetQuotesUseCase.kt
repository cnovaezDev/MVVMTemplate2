package com.example.mvvmtemplate.domain

import com.example.mvvmtemplate.data.QuoteRepository
import com.example.mvvmtemplate.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}