package com.example.mvvmtemplate.data

import com.example.mvvmtemplate.data.model.QuoteModel
import com.example.mvvmtemplate.data.model.QuoteProvider
import com.example.mvvmtemplate.data.network.QuoteService

/**
 * In charge of controlling if the app should use internet or work offline
 */
class QuoteRepository {

    /**
     * New Instance of QuoteService class
     */
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes();
        QuoteProvider.quotes = response
        return response;
    }

}
