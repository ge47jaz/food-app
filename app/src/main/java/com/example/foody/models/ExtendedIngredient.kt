package com.example.foody.models


import com.google.gson.annotations.SerializedName

// copy and paste json api response with the JSON to Kotlin Class plugin
// @Serialization is part of the Gson library
data class ExtendedIngredient(
    // customized to retrieve only the data we need
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("consistency")
    val consistency: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameClean")
    val nameClean: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("unit")
    val unit: String
)