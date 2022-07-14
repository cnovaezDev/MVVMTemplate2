package com.example.mvvmtemplate.domain

import com.example.mvvmtemplate.data.QuoteRepository
import com.example.mvvmtemplate.data.database.entities.toDatabase
import com.example.mvvmtemplate.data.model.QuoteModel
import com.example.mvvmtemplate.domain.model.Quote
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    suspend operator fun invoke(): List<Quote> {
        val quotes = repository.getAllQuotesFromApi()
        return if (quotes.isNotEmpty()) {
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDatabase() });
            quotes;
        } else {
            repository.getAllQuotesFromDatabase()
        }

    }

}