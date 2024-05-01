package com.example.wallpaper.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.wallpaper.data.network.ApiServices
import com.example.wallpaper.ui.categories.CategoriesPagingSource


import javax.inject.Inject

class CategoriesRepository @Inject constructor(private val api : ApiServices) {

    fun categoryPhotos(id: String) = Pager(
        config = PagingConfig(pageSize = 20, maxSize = 100, enablePlaceholders = false),
        pagingSourceFactory = { CategoriesPagingSource(api, id) }
    ).liveData

}