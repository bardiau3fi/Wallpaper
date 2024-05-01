package com.example.wallpaper.data.repository

import com.example.wallpaper.data.network.ApiServices
import javax.inject.Inject

class SplashRepository @Inject constructor(private val api : ApiServices) {
    suspend fun getRandomPhoto() = api.getRandomPhoto()
}