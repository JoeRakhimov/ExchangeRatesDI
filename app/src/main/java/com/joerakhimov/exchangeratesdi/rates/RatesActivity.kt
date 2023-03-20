package com.joerakhimov.exchangeratesdi.rates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels
import com.joerakhimov.exchangeratesdi.R
import kotlinx.android.synthetic.main.activity_rates.*

@AndroidEntryPoint
class RatesActivity : AppCompatActivity() {

    private val ratesViewModel: RatesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rates)
        ratesViewModel.rates.observe(this) { rates ->
            showRates(rates)
        }
    }

    private fun showRates(rates: RatesResponse) {
        title = rates.base
        if (rates.rates != null) {
            recycler_rates.layoutManager = LinearLayoutManager(this)
            recycler_rates.adapter = RatesAdapter(rates.rates)
        }
    }

}