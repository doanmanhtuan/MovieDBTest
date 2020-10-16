package com.example.myapplication.service

import com.example.myapplication.util.Util

class ApiUtil {

    companion object {
        fun getApiService(): APIService {
            return RetrofitClient.getClient(Util.baseUrl).create(APIService::class.java)
        }
    }
}