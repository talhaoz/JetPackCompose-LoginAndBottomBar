package com.example.emergencyapp.ui.bottombar

import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.emergencyapp.navigation.NavigationHost

@Composable
fun AppScaffold(navController: NavController) {
    val scaffoldState = rememberScaffoldState()

    Scaffold(

        bottomBar = {
            BottomBar(navController = navController)
        },
        scaffoldState = scaffoldState,

        ) {

        NavigationHost(navController = navController)
    }

}