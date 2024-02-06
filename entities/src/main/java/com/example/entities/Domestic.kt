package com.example.entities
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Domestic(

    var image: String? = null,
    var index: Int? = null

) : Parcelable