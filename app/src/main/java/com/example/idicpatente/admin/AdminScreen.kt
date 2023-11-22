package com.example.idicpatente.admin

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.idicpatente.admin.components.RecordatorioSec
import com.example.idicpatente.admin.components.RegistroSec
import com.example.idicpatente.main.TopBar

@Composable
fun AdminScreen(
    navController: NavController
){
    Column {
        TopBar(texto = "Administrador")
        RegistroSec()
        RecordatorioSec()
    }
}