package com.talhaoz.loginbottombarapp.navigation

import androidx.annotation.DrawableRes
import com.example.loginbottombarapp.R

sealed class NavigationScreen(val route: String, val title: String, @DrawableRes val icon: Int) {
    object HomeScreen : NavigationScreen(
        route = "home_screen",
        title = "Home",
        icon = R.drawable.ic_home
    )

    object ProfileScreen :
        NavigationScreen(route = "profile_screen", title = "Profile", icon = R.drawable.ic_chat)

    object SettingsScreen : NavigationScreen(
        route = "settings_screen",
        title = "Settings",
        icon = R.drawable.ic_settings
    )
}