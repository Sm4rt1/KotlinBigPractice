package com.smart.bigpractice2.api

import com.smart.bigpractice2.model.JokeItem
import com.smart.bigpractice2.spisok.ListBrains
import retrofit2.http.GET
import retrofit2.http.Query

interface jokeApi {
    @GET("random_ten")
    suspend fun getJokeItems(
        @Query("type") type: String?,
        @Query("setup") setup: String?,
        @Query("punchline") punchline: String?,
        @Query("id") id: String?
    ): List<JokeItem>
}