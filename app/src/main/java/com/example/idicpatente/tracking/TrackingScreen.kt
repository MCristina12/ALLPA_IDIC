package com.example.idicpatente.tracking


import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.idicpatente.main.TopBar
import com.example.idicpatente.tracking.components.DemandChart
import com.example.idicpatente.tracking.components.HistoricPriceChart
import com.example.idicpatente.tracking.components.ProductoTopChart


@Composable
fun TrackingScreen(
    navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 55.dp)
    ) {
        TopBar(texto = "DATOS")

        Text(text = "HISTÓRICO DE PRECIOS",
            modifier = Modifier.padding(top = 16.dp, start = 8.dp ),
            fontWeight = FontWeight.Medium
        )
        HistoricPriceChart()

        Text(text = "HISTÓRICO DE DEMANDA ",
            modifier = Modifier.padding(top = 16.dp, start = 8.dp ),
            fontWeight = FontWeight.Medium
        )

        DemandChart()

        Text(text = "PRODUCTOS CON MAYOR PRECIO",
            modifier = Modifier.padding(top = 16.dp, start = 8.dp ),
            fontWeight = FontWeight.Medium
        )

        ProductoTopChart()

        Button(
            onClick = { navController.navigate("weather")},
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp, bottom = 12.dp , top = 12.dp),
        ) {
            Text(
                text = "PRONÓSTICO DE CLIMA",
                color = Color.White
            )
        }
    }

}