package com.example.firozhasan.retrofitkotlinexample.model.api

import com.example.firozhasan.retrofitkotlinexample.`interface`.Constant
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface JobServices {

    @GET(Constant.CAPITAL)
    fun getKountry(@Path("capital") capitalOfCountry: String): Call<List<Country>>
}