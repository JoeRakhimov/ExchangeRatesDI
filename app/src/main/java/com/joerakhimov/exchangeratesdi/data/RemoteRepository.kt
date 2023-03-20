package com.joerakhimov.niceweatherdi.data

import android.util.Log
import com.joerakhimov.exchangeratesdi.data.Api
import com.joerakhimov.exchangeratesdi.rates.RatesResponse
import javax.inject.Inject

class RemoteRepository (private val api: Api): Repository {
    override suspend fun getRates(): RatesResponse {
        return api.getRates()
    }
}