package com.smart.bigpractice2.nizhnyanavigacia

import androidx.navigation.compose.composable
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import com.smart.bigpractice2.model.JokeItemList
import com.smart.bigpractice2.pages.Home
import com.smart.bigpractice2.pages.List
import com.smart.bigpractice2.pages.Favorites
import com.smart.bigpractice2.pages.Notifications
import com.smart.bigpractice2.pages.Info

@Composable
fun NavGraph(navHostController: NavHostController, jokeItemList: JokeItemList) {
    NavHost(navController = navHostController, startDestination = "list") {
        composable("home"){
            Home()
        }
        composable("list") {
            List(navController = navHostController, jokeItemList = jokeItemList)
        }
        composable("favorites"){
            Favorites()
        }
        composable("notifications"){
            Notifications()
        }
        composable("list/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0
            Info(id = id, jokeItemList = jokeItemList)
        }
    }

}