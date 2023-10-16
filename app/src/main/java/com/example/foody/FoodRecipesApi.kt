package com.example.foody

import com.example.foody.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    // Get request with endpoint recipes/complexSearch with retrofit
    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>
}