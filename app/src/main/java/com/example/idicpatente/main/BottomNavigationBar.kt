package com.example.idicpatente.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(
    navController: NavController
){
    val items = listOf(
        BottomNavItem.Tracking,
        BottomNavItem.Learning,
        BottomNavItem.Admin,
        BottomNavItem.Perfil
    )

    BottomNavigation(backgroundColor = Color(0xFF045658)) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach {item ->
            BottomNavigationItem(
                selected =  currentRoute == item.route,
                label = { Text(text = item.title, color = Color.White) },
                onClick = {
                          navController.navigate(item.route){
                                launchSingleTop = true
                                restoreState = true
                          }
                },
                icon = { Icon(painter = painterResource(id = item.icon),
                              contentDescription = "",
                            tint = Color.White
                    ) })

        }
    }
}