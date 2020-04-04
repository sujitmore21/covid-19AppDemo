package com.portall.covid_19demoapp.model

import com.squareup.moshi.Json

data class TotalDetails(
    val active: String = "0",
    val confirmed: String = "0",
    val deaths: String = "0",
    val recovered: String = "0",

    @Json(name = "lastupdatedtime")
    val lastUpdatedTime: String? = null,
    val state: String = ""
)