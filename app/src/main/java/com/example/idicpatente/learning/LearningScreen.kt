package com.example.idicpatente.learning

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.idicpatente.learning.components.ProductoComponent
import com.example.idicpatente.learning.components.ProductoItem

@Composable
fun LearningScreen(
    navController: NavController
){


    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Tuberculos")
        ProductoItem(producto = "Papa")
        ProductoItem(producto = "Zanahoria")
        ProductoItem(producto = "Camote")
        Text(text = "Verduras")
        ProductoItem(producto = "Tomate")
        ProductoItem(producto = "Lechuga")
    }
}