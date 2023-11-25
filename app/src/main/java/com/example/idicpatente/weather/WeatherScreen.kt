package com.example.idicpatente.weather

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.idicpatente.admin.components.RegistroDatosSec
import com.example.idicpatente.main.TopBar
import com.example.idicpatente.weather.components.FenomenoNaturalItem
import com.example.idicpatente.R

@Composable
fun WeatherScreen(
    navController: NavController
){
    val openDialog = remember { mutableStateOf(false)  }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 50.dp)
    ) {
        TopBar(texto = "PRÓNOSTICO METEOROLÓGICO")
        Button(
            onClick = {
                openDialog.value = true
                      },
            modifier = Modifier
                .align(CenterHorizontally)
                .padding(top = 12.dp)
        ) {
            Text(
                text = "Alerta de Fenómeno Natural"
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, start = 8.dp, end = 8.dp, bottom = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "HOY",
                fontSize = 20.sp
            )
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Text(
                    text = "19 °C",
                    fontSize = 20.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_wb_sunny_24),
                    contentDescription = ""
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.clima),
            contentDescription = "",
            alignment = Center
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .align(CenterHorizontally)
                .padding(top = 12.dp, bottom = 15.dp)
        )
        {
            Text(text = "Selecciona el Día")
        }
    }

    if(openDialog.value){
        FenomenoNaturalItem(state = openDialog)
    }
}