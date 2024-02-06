package com.example.entities
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Type(

    var id: String? = null,
    var name: String? = null,
    var typeCode: String? = null,
    var characteristicCode: String? = null

) : Parcelable