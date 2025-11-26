package com.example.androidarhitecture.store.data.mapper

import com.example.androidarhitecture.store.domain.model.ApiError
import com.example.androidarhitecture.store.domain.model.NetworkError
import okio.IOException
import retrofit2.HttpException

fun Throwable.toNetworkError(): NetworkError{
    val error =when(this){
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
        error =error,
        t=this
    )
}