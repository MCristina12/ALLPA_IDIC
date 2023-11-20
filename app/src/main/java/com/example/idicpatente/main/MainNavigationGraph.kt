package com.example.idicpatente.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.idicpatente.admin.AdminScreen
import com.example.idicpatente.perfil.PerfilScreen
import com.example.idicpatente.tracking.TrackingScreen
import com.example.idicpatente.weather.WeatherScreen

@Composable
fun MainNavigationGraph(
    navHostController: NavHostController
){
    NavHost(navController = navHostController,
            startDestination = "trackig"
    ){
        composable("trackig"){
            TrackingScreen(navController = navHostController)
        }
        composable("weather"){
            WeatherScreen(navController = navHostController)
        }
        composable("admin"){
            AdminScreen(navController = navHostController)
        }
        composable("perfil"){
            PerfilScreen(navController = navHostController)
        }
    }
}