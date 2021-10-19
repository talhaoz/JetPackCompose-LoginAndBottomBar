package com.example.emergencyapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.emergencyapp.ui.bottombar.HomeScreen
import com.example.emergencyapp.ui.bottombar.ProfileScreen
import com.example.emergencyapp.ui.bottombar.SettingsScreen

@Composable
fun NavigationHost(navController: NavController) {
    NavHost(

        navController = navController as NavHostController,
        startDestination = NavigationScreen.HomeScreen.route
    ) {
        composable(NavigationScreen.HomeScreen.route) { HomeScreen() }
        composable(NavigationScreen.ProfileScreen.route) { ProfileScreen() }
        composable(NavigationScreen.SettingsScreen.route) { SettingsScreen() }
    }
}