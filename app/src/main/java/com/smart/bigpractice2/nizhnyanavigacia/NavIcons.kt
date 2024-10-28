package com.smart.bigpractice2.nizhnyanavigacia

import com.smart.bigpractice2.R

sealed class NavIcons(val title: String, val titleId: Int, val titlePath: String) {
    data object Home: NavIcons("Главная", R.drawable.home, "home")
    data object List: NavIcons("Список", R.drawable.list, "list")
    data object Favorites: NavIcons("Избранное", R.drawable.favorites, "favorites")
    data object Notifications: NavIcons("Уведомления", R.drawable.notifications, "notifications")
}