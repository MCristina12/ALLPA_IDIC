package com.example.idicpatente.admin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.idicpatente.admin.components.RecordatorioSec
import com.example.idicpatente.admin.components.RegistroSec
import com.example.idicpatente.calendar.CalendarScreen
import com.example.idicpatente.main.TopBar

@Composable
fun AdminScreen(
    navController: NavController
){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(texto = "Administrador")
        RegistroSec()
        RecordatorioSec(navController)

    }
}