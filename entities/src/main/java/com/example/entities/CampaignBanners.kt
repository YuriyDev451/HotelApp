package com.example.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CampaignBanners(

    var domestic: ArrayList<Domestic> = arrayListOf(),
    var international: ArrayList<String> = arrayListOf()

) : Parcelable