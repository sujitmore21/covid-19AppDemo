package com.portall.covid_19demoapp.api

import com.portall.covid_19demoapp.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface Covid19IndiaApiService {

    @GET("/data.json")
    suspend fun getData(): Response<ApiResponse>

    companion object {
        const val BASE_URL = "https://api.covid19india.org/"
    }
}

