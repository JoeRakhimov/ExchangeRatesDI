package com.joerakhimov.exchangeratesdi.data

import com.joerakhimov.exchangeratesdi.rates.RatesResponse
import retrofit2.http.GET

const val BASE_URL = "http://api.joerakhimov.com"

interface Api {

    @GET("/exchangerates/latest")
    suspend fun getRates(): RatesResponse

}