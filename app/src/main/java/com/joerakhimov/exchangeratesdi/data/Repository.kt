package com.joerakhimov.niceweatherdi.data

import com.joerakhimov.exchangeratesdi.rates.RatesResponse

interface Repository {
    suspend fun getRates(): RatesResponse
}