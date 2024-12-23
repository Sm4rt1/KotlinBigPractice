package com.smart.bigpractice2.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class JokeItemListFactory (
    private val jokeItemUseCase: JokeItemUseCase
): ViewModelProvider.Factory{
    override fun <T: ViewModel> create(modelClass: Class<T>): T{
        if (modelClass.isAssignableFrom(JokeItemList :: class.java)) {
            return JokeItemList(jokeItemUseCase) as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }
}