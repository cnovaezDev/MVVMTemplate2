package com.example.mvvmtemplate.data.network

import com.example.mvvmtemplate.core.RetrofitHelper
import com.example.mvvmtemplate.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Only class to be modified in case the endpoints or the base url or the site changed
 */
class QuoteService @Inject constructor(private val api:QuoteApiClient) {

   suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllQuotes();
           //If body is null, return an empty list
            response.body() ?: emptyList()
        }
    }
}