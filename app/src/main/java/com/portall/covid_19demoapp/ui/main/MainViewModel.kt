package com.portall.covid_19demoapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.portall.covid_19demoapp.model.ApiResponse
import com.portall.covid_19demoapp.repository.CovidIndiaRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
@InternalCoroutinesApi
class MainViewModel(private val repository: CovidIndiaRepository) : ViewModel() {

    private val _covidLiveData = MutableLiveData<State<ApiResponse>>()

    val covidLiveData: LiveData<State<ApiResponse>>
        get() = _covidLiveData

    fun getData() {
        viewModelScope.launch {
            repository.getData().collect {
                _covidLiveData.value = it
            }
        }
    }
}