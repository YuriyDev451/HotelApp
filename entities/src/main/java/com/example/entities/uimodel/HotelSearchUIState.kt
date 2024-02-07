package com.example.entities.uimodel

data class HotelSearchUIState (
    //val header: SearchHeaderUiModel,
    val hotels: List<HotelListUIModel>?)

//data class SearchHeaderUiModel(
//    val origin : String,
//    val destination: String)

data class HotelListUIModel(
    val id: Int,
    val name: String,
    val address: String,
    val country: String,
    val city: String,
    val reviewScore: Int,
    val startRating: Int,
    val checkInTime: String,
    val checkOutTime: String,
    val cityCenterDistance: Double,
    val cityCenterDistanceName: String,
    val thumbnailImage: String)