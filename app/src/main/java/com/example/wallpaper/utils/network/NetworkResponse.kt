package com.example.wallpaper.utils.network

import com.example.wallpaper.data.model.ResponseErrors
import com.google.gson.Gson
import retrofit2.Response

open class NetworkResponse<T>(private val response: Response<T>) {

    open fun generateResponse(): NetworkRequest<T> {
        return when {
            response.code() == 401 -> NetworkRequest.Error("You are not authorized")
            response.code() == 422 -> {
                var errorMessage = ""
                if (response.errorBody() != null) {
                    val errorResponse = Gson().fromJson(response.errorBody()?.charStream(), ResponseErrors::class.java)

                    val errors = errorResponse.errors
                    errors?.forEach {
                        errorMessage = it
                    }
                }
                NetworkRequest.Error(errorMessage)
            }

            response.code() == 500 -> NetworkRequest.Error("Try again")
            response.isSuccessful -> NetworkRequest.Success(response.body()!!)
            else -> NetworkRequest.Error(response.message())
        }
    }
}