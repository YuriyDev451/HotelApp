package com.example.data

import com.example.entities.Hotels
import com.example.entities.HotelsResponse
import com.example.networks.api.ApiService
import javax.inject.Inject


interface HotelsRepositoryInterface{
    suspend fun getHotelList(): HotelsResponse?
}


class HotelsRepository @Inject constructor(private val apiService: ApiService): HotelsRepositoryInterface {
    override suspend fun getHotelList(): HotelsResponse? {
        return apiService.getHotelList()
    }

}