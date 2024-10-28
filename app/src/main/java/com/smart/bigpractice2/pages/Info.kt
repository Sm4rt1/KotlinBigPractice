package com.smart.bigpractice2.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.core.provider.FontsContractCompat.Columns
import com.smart.bigpractice2.spisok.ListBrains

@Composable
fun Info(id: Int, listBrains: ListBrains) {
    val item = listBrains.CarItems[id]
    Column {
        Text(item.nome)
        Text(item.codigo)
    }
}