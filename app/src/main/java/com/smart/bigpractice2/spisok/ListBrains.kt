package com.smart.bigpractice2.spisok

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel

data class Car(
    val codigo: String, val nome: String
)

class ListBrains: ViewModel() {
    private val items = mutableStateListOf(
        Car(
            codigo = "32000-1", nome = "32000 Gasolina"
        ),
        Car(
            codigo = "32000-3", nome = "32000 Diesel"
        ),
        Car(
            codigo = "2025-1", nome = "2025 Gasolina"
        ),
        Car(
            codigo = "2025-3", nome = "2025 Diesel"
        ),
        Car(
            codigo = "2024-1", nome = "2024 Gasolina"
        )
    )

    val CarItems: SnapshotStateList<Car> get() = items
}