package com.example.wallpaper.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wallpaper.data.model.home.ResponsePhotos
import com.example.wallpaper.data.model.home.ResponseTopics
import com.example.wallpaper.data.repository.HomeRepository
import com.example.wallpaper.utils.network.NetworkRequest
import com.example.wallpaper.utils.network.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository) : ViewModel() {

    init {
        viewModelScope.launch {
            delay(300)
            getNewestPhotos()
            getTopics()
        }
    }

    //newest
    private val _newestPhotosLiveData = MutableLiveData<NetworkRequest<ResponsePhotos>>()
    var newestPhotosLiveData: LiveData<NetworkRequest<ResponsePhotos>> = _newestPhotosLiveData

    //topics
    private val _topicsLiveData = MutableLiveData<NetworkRequest<ResponseTopics>>()
    var topicsLiveData: LiveData<NetworkRequest<ResponseTopics>> = _topicsLiveData


    //--- api call methods ---//
    private fun getNewestPhotos() = viewModelScope.launch {
        _newestPhotosLiveData.value = NetworkRequest.Loading()

        val response = repository.getNewestPhotos()

        _newestPhotosLiveData.value = NetworkResponse(response).generateResponse()
    }

    private fun getTopics() = viewModelScope.launch {
        _topicsLiveData.value = NetworkRequest.Loading()

        val response = repository.getTopics()

        _topicsLiveData.value = NetworkResponse(response).generateResponse()
    }

    //--- other methods ---//
    fun getColorTones() = repository.getColorTones()
}