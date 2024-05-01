package com.example.wallpaper.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wallpaper.data.model.detail.ResponseDetail
import com.example.wallpaper.data.repository.DetailRepository
import com.example.wallpaper.utils.network.NetworkRequest
import com.example.wallpaper.utils.network.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val repository : DetailRepository) : ViewModel() {

    //detail
    private val _detailLiveData = MutableLiveData<NetworkRequest<ResponseDetail>>()
    var detailLiveData : LiveData<NetworkRequest<ResponseDetail>> =  _detailLiveData

    //--- api call methods ---//
    fun getDetailPhoto(id : String) = viewModelScope.launch {
        _detailLiveData.value = NetworkRequest.Loading()

        val response = repository.getDetailPhoto(id)

        _detailLiveData.value = NetworkResponse(response).generateResponse()
    }
}