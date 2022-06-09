package com.talhaoz.loginbottombarapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.talhaoz.loginbottombarapp.ui.bottombar.HomeScreen
import com.talhaoz.loginbottombarapp.ui.bottombar.ProfileScreen
import com.talhaoz.loginbottombarapp.ui.bottombar.SettingsScreen

@Composable
fun NavigationHost(
    navController: NavController,
    logout: () -> Unit
) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = NavigationScreen.HomeScreen.route
    ) {
        composable(NavigationScreen.HomeScreen.route) { HomeScreen() }
        composable(NavigationScreen.ProfileScreen.route) { ProfileScreen() }
        composable(NavigationScreen.SettingsScreen.route) {
            SettingsScreen() {
                logout()
            }
        }
    }
}