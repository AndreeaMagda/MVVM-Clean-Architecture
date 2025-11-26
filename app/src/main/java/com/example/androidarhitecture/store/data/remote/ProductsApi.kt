package com.example.androidarhitecture.store.data.remote

import com.example.androidarhitecture.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts():List<Product>
}