package com.joerakhimov.exchangeratesdi.rates

import com.google.gson.annotations.SerializedName

data class RatesResponse(

	@field:SerializedName("rates")
	val rates: List<RatesItem>? = null,

	@field:SerializedName("base")
	val base: String? = null
)

data class RatesItem(

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("rate")
	val rate: Double? = null

)
