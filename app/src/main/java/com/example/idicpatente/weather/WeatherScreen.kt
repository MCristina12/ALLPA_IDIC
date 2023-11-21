package com.example.idicpatente.weather

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun WeatherScreen(
    navController: NavController
){
    Column {
        Button(
            onClick = { navController.navigate("fenomeno")},
            modifier = Modifier.align(CenterHorizontally)
        ) {
            Text(text = "Alerta de Fenómeno Natural")
        }
    }
}