package com.smart.bigpractice2.model

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.io.IOException


class JokeItemList(private val jokeItemUseCase: JokeItemUseCase): ViewModel() {
    private val _jiList = mutableStateOf<List<JokeItem>>(emptyList())
    val jilist: State<List<JokeItem>> = _jiList
    init {
        loadJokeItems()
    }
    private fun loadJokeItems(){
        viewModelScope.launch {
            try {
                val items = jokeItemUseCase(
                    type = null,
                    setup = null,
                    punchline = null,
                    id = null
                )
                _jiList.value = items
            } catch (networkException: IOException) {
                println("Network error: ${networkException.localizedMessage}")
                _jiList.value = emptyList()
            } catch (exception: Exception) {
                println("Error: ${exception.localizedMessage}")
                _jiList.value = emptyList()
            }
        }
    }
}