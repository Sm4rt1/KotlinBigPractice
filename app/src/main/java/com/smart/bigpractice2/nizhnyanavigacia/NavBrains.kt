package com.smart.bigpractice2.nizhnyanavigacia


import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState


@Composable
fun NavBrains(navController: NavController) {
    val bottomIcons = listOf(
        NavIcons.Home, NavIcons.List, NavIcons.Favorites, NavIcons.Notifications
    )

    NavigationBar {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val curPath = backStackEntry?.destination?.route

        bottomIcons.forEach{BottomIcon ->
            NavigationBarItem(
                selected = curPath == BottomIcon.titlePath,
                onClick = {
                    navController.navigate(BottomIcon.titlePath)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = BottomIcon.titleId),
                        contentDescription = ""
                    )
                },
                label = {
                    Text(text = BottomIcon.title)
                }
            )

        }


    }
}