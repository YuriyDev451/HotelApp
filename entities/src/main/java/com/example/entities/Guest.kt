package com.example.entities
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Guest(

    var adults: Int? = null,
    var children: Int? = null

) : Parcelable