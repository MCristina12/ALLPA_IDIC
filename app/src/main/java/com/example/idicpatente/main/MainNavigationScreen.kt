package com.example.idicpatente.main

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainNavigationScreen(
    navController: NavHostController = rememberNavController()
){
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        MainNavigationGraph(navHostController = navController)
    }
}