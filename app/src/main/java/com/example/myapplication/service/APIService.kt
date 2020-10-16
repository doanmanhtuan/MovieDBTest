package com.example.myapplication.service

import com.example.myapplication.model.ResponseMovie
import retrofit2.Call
import retrofit2.http.GET

interface APIService {

    @GET("popular?api_key=2e74bf0f43090b1679a981abd42cce50")
    fun getPopularMovie(): Call<ResponseMovie?>
}