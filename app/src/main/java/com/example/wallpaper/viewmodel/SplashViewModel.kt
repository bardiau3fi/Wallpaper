package com.example.wallpaper.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wallpaper.data.model.splash.ResponseRandom
import com.example.wallpaper.data.repository.SplashRepository
import com.example.wallpaper.utils.network.NetworkRequest
import com.example.wallpaper.utils.network.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class SplashViewModel @Inject constructor(private val repository : SplashRepository) : ViewModel() {

    //random
    private val _randomLiveData = MutableLiveData<NetworkRequest<ResponseRandom>>()
    var randomLiveData : LiveData<NetworkRequest<ResponseRandom>> =  _randomLiveData

    //--- api call methods ---//
    fun getRandomPhoto() = viewModelScope.launch {
        _randomLiveData.value = NetworkRequest.Loading()

        val response = repository.getRandomPhoto()

        _randomLiveData.value = NetworkResponse(response).generateResponse()
    }
}