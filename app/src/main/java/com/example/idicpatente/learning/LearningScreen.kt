package com.example.idicpatente.learning

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.idicpatente.learning.components.ProductoComponent
import com.example.idicpatente.learning.components.ProductoItem
import com.example.idicpatente.main.TopBar

@Composable
fun LearningScreen(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        TopBar(texto = "APRENDE")

        Column(modifier = Modifier.padding(top = 12.dp, start = 8.dp, end = 8.dp)) {
            Text(
                text = "TUBÉRCULOS",
                modifier = Modifier.padding(bottom = 8.dp),
                fontWeight = FontWeight.Medium
            )
            ProductoItem(producto = "Papa", temp = "Marzo - Abril")
            ProductoItem(producto = "Zanahoria", temp = "Marzo - Mayo")
            ProductoItem(producto = "Camote", temp = "Enero - Abril")

            Text(
                text = "VERDURAS",
                modifier = Modifier.padding(bottom = 8.dp, top = 12.dp),
                fontWeight = FontWeight.Medium
            )
            ProductoItem(producto = "Tomate", temp = "Mayo - Agosto")
            ProductoItem(producto = "Lechuga", temp = "Abril - Octubre")
        }
    }
}