package com.example.foody.models


import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    // customized to retrieve only the data we need
    @SerializedName("results")
    val results: List<Result>
)