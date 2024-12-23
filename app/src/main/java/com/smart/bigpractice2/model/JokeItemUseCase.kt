package com.smart.bigpractice2.model

import com.smart.bigpractice2.api.JokeItemContainer

class JokeItemUseCase (private val repo: JokeItemContainer) {
    suspend operator fun invoke(
        type: String?,
        setup: String?,
        punchline: String?,
        id: String?
    ): List<JokeItem> {
        return repo.getJokeItems(type,setup,punchline,id)
    }
}