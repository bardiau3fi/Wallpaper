package com.example.wallpaper.data.repository

import android.content.Context
import androidx.core.content.ContextCompat
import com.example.wallpaper.R
import com.example.wallpaper.data.model.home.ColorToneModel
import com.example.wallpaper.data.network.ApiServices

import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class HomeRepository @Inject constructor(@ApplicationContext val context: Context, private val api : ApiServices) {
    suspend fun getNewestPhotos() = api.getNewestPhotos()
    suspend fun getTopics() = api.getTopics()

    fun getColorTones(): MutableList<ColorToneModel> {
        val colors = mutableListOf<ColorToneModel>()
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.blue), context.getString(R.string.blue)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.green), context.getString(R.string.green)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.teal), context.getString(R.string.teal)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.yellow), context.getString(R.string.yellow)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.orange), context.getString(R.string.orange)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.red), context.getString(R.string.red)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.purple), context.getString(R.string.purple)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.darkStrategy), context.getString(R.string.black)))
        colors.add(ColorToneModel(ContextCompat.getColor(context, R.color.white), context.getString(R.string.white)))
        return colors
    }
}