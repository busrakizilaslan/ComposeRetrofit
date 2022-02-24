package com.busrayalcin.composeretrofit.service

import com.busrayalcin.composeretrofit.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    @GET("prices?key=ec5445483928a43205a5ac1a345da8508bbb8019")
    fun getData() : Call<List<CryptoModel>>
}