package com.example.mvvmtemplate.data

import com.example.mvvmtemplate.data.database.dao.QuoteDao
import com.example.mvvmtemplate.data.database.entities.QuoteEntity
import com.example.mvvmtemplate.data.network.QuoteService
import com.example.mvvmtemplate.domain.model.Quote
import com.example.mvvmtemplate.domain.model.toDomain
import javax.inject.Inject

/**
 * In charge of controlling if the app should use internet or work offline
 */
class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteDao: QuoteDao
) {

    suspend fun getAllQuotesFromApi(): List<Quote> {
        val response = api.getQuotes();
        return response.map { it.toDomain() };
    }

    suspend fun getAllQuotesFromDatabase(): List<Quote> {
        val response = quoteDao.getAllQuotes()
        return response.map { it.toDomain() };
    }

    suspend fun insertQuotes(quotes:List<QuoteEntity>){
        quoteDao.insertAll(quotes);
    }

    suspend fun clearQuotes() {
        quoteDao.deleteAllQuotes()
    }

}
