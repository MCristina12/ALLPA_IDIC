package com.example.idicpatente.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.idicpatente.admin.AdminScreen
import com.example.idicpatente.learning.LearningScreen
import com.example.idicpatente.perfil.PerfilScreen
import com.example.idicpatente.tracking.TrackingScreen
import com.example.idicpatente.weather.FenomenoScreen
import com.example.idicpatente.weather.WeatherScreen

@Composable
fun MainNavigationGraph(
    navHostController: NavHostController
){
    NavHost(navController = navHostController,
            startDestination = "tracking"
    ){
        composable("tracking"){
            TrackingScreen(navController = navHostController)
        }
        composable("weather"){
            WeatherScreen(navController = navHostController)
        }
        composable("learning"){
            LearningScreen(navController = navHostController)
        }
        composable("admin"){
            AdminScreen(navController = navHostController)
        }
        composable("perfil"){
            PerfilScreen(navController = navHostController)
        }
        composable("fenomeno"){
            FenomenoScreen(navController = navHostController)
        }
    }
}