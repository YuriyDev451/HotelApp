package com.example.entities
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Country(

    var code: String? = null,
    var name: String? = null

) : Parcelable