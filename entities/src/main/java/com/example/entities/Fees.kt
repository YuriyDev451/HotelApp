package com.example.entities
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fees(

    var mandatory: String? = null,
    var optional: String? = null

) : Parcelable