package com.giant.liders.data

import com.giant.liders.data.model.ArticlesResponse
import retrofit2.http.GET

interface LidersApi {
    @GET("multicamp/communities")
    suspend fun ArticlesResponse(): ArticlesResponse
}