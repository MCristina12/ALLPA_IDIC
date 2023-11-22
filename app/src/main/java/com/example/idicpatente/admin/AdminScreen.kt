package com.example.idicpatente.admin

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.idicpatente.admin.components.RecordatorioSec
import com.example.idicpatente.admin.components.RegistroSec

@Composable
fun AdminScreen(
    navController: NavController
){
    Column {
        RegistroSec()
        RecordatorioSec()
    }
}