package com.smart.bigpractice2.api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object retrofit {
    private const val apiUrl = "https://official-joke-api.appspot.com/"
    val api: jokeApi by lazy {
        Retrofit.Builder()
            .baseUrl(apiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(jokeApi::class.java)
    }

}