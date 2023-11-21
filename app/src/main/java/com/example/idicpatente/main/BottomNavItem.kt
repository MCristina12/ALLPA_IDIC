package com.example.idicpatente.main

import com.example.idicpatente.R

sealed class BottomNavItem(
    val route : String,
    val title : String,
    val icon : Int,
){
    object Tracking: BottomNavItem(
        route = "tracking",
        title = "Tracking",
        icon = R.drawable.baseline_bar_chart_24
    )
    object Learning: BottomNavItem(
        route = "learning",
        title = "Learning",
        icon = R.drawable.baseline_lightbulb_24
    )
    object Admin: BottomNavItem(
        route = "admin",
        title = "Admin",
        icon = R.drawable.baseline_folder_open_24
    )
    object Perfil: BottomNavItem(
        route = "perfil",
        title = "Perfil",
        icon = R.drawable.baseline_person_24
    )
}