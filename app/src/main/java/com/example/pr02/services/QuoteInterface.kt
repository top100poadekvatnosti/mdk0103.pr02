package com.example.pr02.services

import com.example.pr02.data.Quote
import retrofit2.http.Body
import retrofit2.http.POST

interface QuoteInterface {
    @POST("quotes/add")
    suspend fun  addQuote(@Body quote: Quote): Quote
}