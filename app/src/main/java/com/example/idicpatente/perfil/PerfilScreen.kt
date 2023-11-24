package com.example.idicpatente.perfil

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.idicpatente.R
import com.example.idicpatente.main.TopBar

@Composable
fun PerfilScreen(
    navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
    ) {
        TopBar(texto = "Perfil")
        Image(
            painter = painterResource(id = R.drawable.baseline_person_24),
            contentDescription = "",
            modifier = Modifier.padding(top = 24.dp)
        )
        Text(
            text = "Diego Olazabal Cisneros",
            modifier = Modifier.padding(top = 12.dp),
            textAlign = TextAlign.Center
        )

        Row(

        ) {

        }

    }
}