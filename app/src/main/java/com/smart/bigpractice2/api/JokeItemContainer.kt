package com.smart.bigpractice2.api

import com.smart.bigpractice2.model.JokeItem
import com.smart.bigpractice2.model.JokeItemList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

class JokeItemContainer(private val api: jokeApi) {
    suspend fun getJokeItems(
        type: String?,
        setup: String?,
        punchline: String?,
        id: String?
    ): List<JokeItem> {
        return withContext(Dispatchers.IO) {
            try {
                val jokeItemsList = api.getJokeItems(type, setup, punchline, id)
                jokeItemsList.map{it ->
                    JokeItem(
                        type = it.type,
                        setup = it.setup,
                        punchline = it.punchline,
                        id = it.id
                    )
                }
            } catch (networkException: IOException) {
                println("Network error: ${networkException.localizedMessage}")
                emptyList()
            } catch (exception: Exception) {
                println("Error: ${exception.localizedMessage}")
                emptyList()
            } !!
        }
    }
}