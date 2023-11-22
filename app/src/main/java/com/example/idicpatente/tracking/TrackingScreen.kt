package com.example.idicpatente.tracking


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.idicpatente.main.TopBar
import com.example.idicpatente.tracking.components.HistoricPriceChart


@Composable
fun TrackingScreen(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(texto = "DATOS HISTÓRICOS")
        Text(text = "HISTÓRICO DE PRECIOS",
            modifier = Modifier.padding(top = 16.dp, start = 8.dp ),
            fontWeight = FontWeight.Medium
        )
        HistoricPriceChart()
    }

}