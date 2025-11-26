package com.example.androidarhitecture.store.domain.model

import android.media.Rating
import androidx.navigation.NavDestination

data class Product (
    val id:Int,
    val title:String,
    val price:Double,
    val description:String,
    val category: String,
    val image: String,
    val rating: Rating

    )

data class Rating(
    val rage:Double,
    val count: Int
)