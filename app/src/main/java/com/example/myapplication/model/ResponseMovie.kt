package com.example.myapplication.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


data class ResponseMovie(
    @SerializedName("page")
    @Expose
    val page: Int? = null,

    @SerializedName("total_results")
    @Expose
    val totalResults: Int? = null,

    @SerializedName("total_pages")
    @Expose
    val totalPages: Int? = null,

    @SerializedName("results")
    @Expose
    val results: List<Movie>? = null
)