package com.example.idicpatente.perfil

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material3.Button
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.idicpatente.LoginActivity
import com.example.idicpatente.MainActivity
import com.example.idicpatente.R
import com.example.idicpatente.main.TopBar

@Composable
fun PerfilScreen(
    navController: NavController
){
    val context = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(texto = "Perfil")
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.baseline_person_24),
                contentDescription = "",
                modifier = Modifier.padding(top = 24.dp)
                    .height(100.dp)
                    .width(100.dp)
                    .clip(shape = RoundedCornerShape(50.dp))
                    .background(Color.LightGray)
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth(),
                alignment = Alignment.Center
            )
            Text(
                text = "Diego Olazabal Cisneros",
                modifier = Modifier.padding(top = 12.dp, bottom = 16.dp).fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Productos",
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "5",
                        fontWeight = FontWeight.Light
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Hectareas",
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "500",
                        fontWeight = FontWeight.Light
                    )
                }
            }

            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 12.dp, bottom = 4.dp)
            ) {
                Text(
                    text = "Configurar Datos Personales",
                    modifier = Modifier.padding(start = 8.dp, top = 12.dp, bottom = 12.dp)
                )
            }
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 12.dp, bottom = 4.dp)
            ) {
                Text(
                    text = "Configurar Datos Agricolas",
                    modifier = Modifier.padding(start = 8.dp, top = 12.dp, bottom = 12.dp)
                )
            }
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 12.dp, bottom = 4.dp)
            ) {
                Text(
                    text = "Validar datos",
                    modifier = Modifier.padding(start = 8.dp, top = 12.dp, bottom = 12.dp)
                )
            }
            Card(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, end = 8.dp, top = 12.dp, bottom = 4.dp)
            ) {
                Text(
                    text = "Resumen General",
                    modifier = Modifier.padding(start = 8.dp, top = 12.dp, bottom = 12.dp)

                )
            }

            Button(
                onClick = {
                    val intent = Intent(context, LoginActivity::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp )

                ) {
                Text(text = "Cerrar Sesión")
            }

        }
    }

}