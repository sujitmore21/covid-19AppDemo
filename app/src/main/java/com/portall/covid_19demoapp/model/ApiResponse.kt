package com.portall.covid_19demoapp.model

import com.squareup.moshi.Json

data class ApiResponse(
    @Json(name = "statewise")
    val stateWiseDetails: List<TotalDetails>
)