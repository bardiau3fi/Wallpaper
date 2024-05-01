package com.example.wallpaper.ui.search

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.wallpaper.data.model.search.ResponseSearch
import com.example.wallpaper.data.network.ApiServices
import javax.inject.Inject

class SearchPagingSource @Inject constructor(private val api: ApiServices, private val query: String) :
    PagingSource<Int, ResponseSearch.Result>() {

    private val pageIndex = 1

    override fun getRefreshKey(state: PagingState<Int, ResponseSearch.Result>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResponseSearch.Result> {
        val position = params.key ?: pageIndex
        return try {
            val response = api.searchPhotos(query, position)
            val data = response.body()?.results

            LoadResult.Page(
                data = data!!,
                prevKey = if (position == pageIndex) null else position - 1,
                nextKey = if (data.isEmpty()) null else position + 1
            )

        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}