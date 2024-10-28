package com.smart.bigpractice2.nizhnyanavigacia

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.smart.bigpractice2.spisok.ListBrains

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(listBrains: ListBrains) {
    val navController = rememberNavController()
    Scaffold(bottomBar = { NavBrains(navController = navController) }) {
        Box(modifier = Modifier.padding(it)) {
            NavGraph(navHostController = navController, listBrains)
        }
    }
}