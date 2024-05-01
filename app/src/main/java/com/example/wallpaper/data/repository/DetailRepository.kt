package com.example.wallpaper.data.repository

import com.example.wallpaper.data.network.ApiServices
import javax.inject.Inject

class DetailRepository @Inject constructor(private val api : ApiServices) {
    suspend fun getDetailPhoto(id : String) = api.getDetailPhoto(id)
}