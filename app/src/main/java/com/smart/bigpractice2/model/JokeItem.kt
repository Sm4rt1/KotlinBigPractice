package com.smart.bigpractice2.model
import com.google.gson.annotations.SerializedName

data class JokeItem(
    @SerializedName("type") val type: String,
    @SerializedName("setup") val setup: String,
    @SerializedName("punchline") val punchline: String,
    @SerializedName("id") val id: Int
)