package com.smart.bigpractice2.pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.smart.bigpractice2.spisok.ListBrains

@Composable
fun List(navController: NavHostController, listBrains: ListBrains) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(30.dp)
    ) {
        items(listBrains.CarItems.size){id ->
            val item = listBrains.CarItems[id]
            Text(text = item.nome, modifier = Modifier.fillMaxWidth().clickable {
                navController.navigate("list/$id")
            })
        }
    }
}