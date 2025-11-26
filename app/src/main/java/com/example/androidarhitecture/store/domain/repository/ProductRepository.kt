package com.example.androidarhitecture.store.domain.repository

import arrow.core.Either
import com.example.androidarhitecture.store.domain.model.NetworkError
import com.example.androidarhitecture.store.domain.model.Product

interface ProductRepository {

    suspend fun getProducts(): Either<NetworkError, List<Product>>

}