package com.example.mvvmtemplate.domain

import com.example.mvvmtemplate.data.QuoteRepository
import com.example.mvvmtemplate.data.model.QuoteModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(val repository:QuoteRepository) {

   suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}