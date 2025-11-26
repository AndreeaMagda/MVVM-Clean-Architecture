package com.example.androidarhitecture.store.presentation.products_screen

import com.example.androidarhitecture.store.domain.model.Product

data class ProductsViewState (
    val isLoading: Boolean =false,
    val products:List<Product> = emptyList(),
    val error: String?=null
)