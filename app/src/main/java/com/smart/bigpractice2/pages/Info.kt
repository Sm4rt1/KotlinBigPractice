package com.smart.bigpractice2.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import com.smart.bigpractice2.model.JokeItemList


@Composable
fun Info(id: Int, jokeItemList: JokeItemList) {
    val items = jokeItemList.jilist.value
    val item = items.getOrNull(id)
    if (item != null) {
        Column(modifier = Modifier.padding(top = 50.dp, start = 16.dp, end = 16.dp)){
            Text(text = "Joke number: ${item.id}")
            Text(text = "Joke genre: ${item.type}")
            Text(text = "Joke: ${item.setup}")
            Text(text = item.punchline)
        }
    }
}