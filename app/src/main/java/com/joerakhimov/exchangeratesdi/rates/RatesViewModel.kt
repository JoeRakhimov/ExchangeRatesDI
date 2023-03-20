package com.joerakhimov.exchangeratesdi.rates

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.joerakhimov.niceweatherdi.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RatesViewModel @Inject constructor(val repository: Repository) : ViewModel() {

    private val _rates = MutableLiveData<RatesResponse>()
    val rates: LiveData<RatesResponse> = _rates

    init {
        getRates()
    }

    private fun getRates() {
        viewModelScope.launch {
            _rates.value = repository.getRates()
        }
    }

}