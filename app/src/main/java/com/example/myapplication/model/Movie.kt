package com.example.myapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Movie(


    @SerializedName("popularity")
    @Expose
    var popularity: Double = 0.0,

    @SerializedName("vote_count")
    @Expose
    var voteCount: Int = 0,

    @SerializedName("video")
    @Expose
    private var video: Boolean = false,

    @SerializedName("poster_path")
    @Expose
    var posterPath: String? = "",

    @SerializedName("id")
    @Expose
    var id: Int = 0,

    @SerializedName("adult")
    @Expose
    var adult: Boolean = false,

    @SerializedName("backdrop_path")
    @Expose
    var backdropPath: String? = "",

    @SerializedName("original_language")
    @Expose
    var originalLanguage: String? = "",

    @SerializedName("original_title")
    @Expose
    var originalTitle: String? = "",

    @SerializedName("genre_ids")
    @Expose
    var genreIds: List<Int>? = null,

    @SerializedName("title")
    @Expose
    var title: String? = "",

    @SerializedName("vote_average")
    @Expose
    var voteAverage: Double = 0.0,

    @SerializedName("overview")
    @Expose
    var overview: String? = "",

    @SerializedName("release_date")
    @Expose
    var releaseDate: String? = ""
)