package com.giant.liders.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
data class ArticlesResponse(
    val articles: ArrayList<Article>
)

@Serializable
@Parcelize
data class Article(
    val name: String?,
    val destination: String?,
    val banner: String?,
    val leaders: Leaders
) : Parcelable

@Serializable
@Parcelize
data class Leaders(
    val name: String?,
    val photo: String?,
    val links: Links
) : Parcelable

@Serializable
@Parcelize
data class Links(
    val instagram: String?,
    val twitter: String?,
    val youtube: String?,
    val participation: String?
) : Parcelable