package com.example.entities
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Coordinate(

    var longitude: Double? = null,
    var latitude: Double? = null

) : Parcelable