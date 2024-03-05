package com.example.common

import android.net.Uri
import androidx.navigation.NavController


fun NavController.toHotels(){
    val uri = Uri.parse("hotels://hotels")
    this.navigate(uri)
}

fun NavController.toFavorite(){
    val uri = Uri.parse("hotels://favorite")
    this.navigate(uri)
}