package com.example.idicpatente.main

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopBar(
    texto : String
){
    //0xFFD0BCFF
    TopAppBar(
        backgroundColor = Color(0xFFfdac07)
    ) {
        Text(
            text = texto.uppercase(),
            textAlign = TextAlign.Center,
            modifier = Modifier
                        .fillMaxWidth()

        )
    }
}

@Composable
@Preview(showBackground = true)
fun ShowLoginScreen() {
    TopBar("Datos")
}