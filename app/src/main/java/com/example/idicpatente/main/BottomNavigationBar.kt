package com.example.idicpatente.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(
    navController: NavController
){
    val items = listOf(
        BottomNavItem.Tracking,
        BottomNavItem.Weather,
        BottomNavItem.Admin,
        BottomNavItem.Perfil
    )

    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach {item ->
            BottomNavigationItem(
                selected =  currentRoute == item.route,
                label = { Text(text = item.title) },
                onClick = {
                          navController.navigate(item.route){
                                launchSingleTop = true
                                restoreState = true
                          }
                },
                icon = { Icon(painter = painterResource(id = item.icon),
                              contentDescription = "") })

        }
    }
}