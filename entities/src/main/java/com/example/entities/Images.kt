package com.example.entities
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Images(

    var url: String? = null,
    var name: String? = null,
    var type: String? = null

) : Parcelable