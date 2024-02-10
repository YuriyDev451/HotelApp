package com.example.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HotelsDbModel(
    @PrimaryKey(autoGenerate = true)
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
    val thumbnailImage: String,
    val price: Int,
    val roomName: String
)
