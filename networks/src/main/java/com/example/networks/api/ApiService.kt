package com.example.networks.api

import com.example.entities.Hotels
import com.example.entities.HotelsResponse
import retrofit2.http.GET


interface ApiService {


    @GET("hotels")
    suspend fun getHotelList(): HotelsResponse?


}