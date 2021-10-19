package com.example.emergencyapp.ui

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.emergencyapp.ui.bottombar.AppScaffold
import com.example.emergencyapp.ui.login.LoginScreen
import com.example.emergencyapp.ui.login.RegisterScreen
import com.example.emergencyapp.ui.theme.EmergencyAppTheme
import com.example.emergencyapp.viewmodel.UserViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    private val userViewModel by viewModel<UserViewModel>()

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

        setContent {
            EmergencyAppTheme {
                LoginApplication(userViewModel)
            }
        }
    }
}

@Composable
fun LoginApplication(userViewModel: UserViewModel) {
    val navController = rememberNavController()
    val navBarNavController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {
        composable(
            route = Screen.LoginScreen.route,
            content = {
                LoginScreen(
                    navController = navController,
                    userViewModel
                )
            })
        composable(
            route = Screen.RegisterScreen.route,
            content = { RegisterScreen(navController = navController) })
        composable(
            route = Screen.AppScaffold.route,
            content = { AppScaffold(navController = navBarNavController) })

    }
}
