package com.example.idicpatente.admin.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Alignment

@Composable
fun RegistroSec(){
    val openDialog = remember { mutableStateOf(false)  }

    val openDialogGastos = remember { mutableStateOf(false)  }
    val dividerOn = remember { mutableStateOf( false ) }
    val tipoGasto = listOf("Mano de Obra", "Fertilizante", "Agua")

    val datos = remember {
        mutableStateOf(
            arrayListOf(
                listOf("Producto", "Precio", "Hectáreas", "Toneladas"),
                listOf("Papa", "0.6", "3",  "4"),
                listOf("Camote", "0.8", "1",  "5")
            )
        )
    }

    val gastos = remember {
        mutableStateOf(
            arrayListOf(
                listOf("Descripción", "Gasto"),
                listOf("Mano de obra", "1000"),
                listOf("Fertilizante", "500")
            )
        )
    }




    Column(
        modifier = Modifier
            .padding(bottom = 12.dp, start = 8.dp, end = 8.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { openDialog.value = true },
                modifier = Modifier.padding(start = 8.dp, top = 16.dp, bottom = 16.dp)
            ) {
                Text(text = "Ingresa los datos")
            }

            DropMenuPeriodoItem()
        }

        Text(text = "Tus productos", modifier = Modifier.padding(start = 8.dp, top = 16.dp, bottom = 4.dp))
        Divider()
        for (fila in datos.value) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, top = 2.dp, bottom = 2.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                for (celda in fila) {
                    var weight = .3f
                    if (celda == fila.first() || celda == fila[2] || celda == fila.last()){
                        weight = .3f
                    }else{
                        weight = .25f
                    }

                    Text(
                        text = celda,
                        modifier = Modifier
                            .padding(start = 8.dp, end = 8.dp, bottom = 4.dp, top = 8.dp)
                            .weight(weight),
                        textAlign = TextAlign.Center
                    )
                    if (celda != fila.last()) {
                        // La celda es la última de la fila
                        Divider(modifier = Modifier
                            .fillMaxHeight(.08f)//fill the max height
                            .width(1.dp))
                    }

                }

            }
            Divider()
        }


        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { openDialogGastos.value = true },
                modifier = Modifier.padding(start = 8.dp, top = 16.dp, bottom = 16.dp)
            ) {
                Text(text = "Ingresa los gastos")
            }

            DropMenuGastoItem()
        }
        Text(text = "Tus gastos", modifier = Modifier.padding(start = 8.dp, top = 16.dp, bottom = 4.dp))


        
        Divider()
        for (fila in gastos.value) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, top = 2.dp, bottom = 2.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                for (celda in fila) {
                    var weight = .3f
                    if (celda == fila.first() || celda == fila.last()){
                        weight = .3f
                    }else{
                        weight = .25f
                    }

                    Text(
                        text = celda,
                        modifier = Modifier
                            .padding(start = 8.dp, end = 8.dp, bottom = 4.dp, top = 8.dp)
                            .weight(weight),
                        textAlign = TextAlign.Center
                    )
                    if (celda != fila.last()) {
                        // La celda es la última de la fila
                        Divider(modifier = Modifier
                            .fillMaxHeight(.08f)//fill the max height
                            .width(1.dp))
                    }

                }

            }
            Divider()
        }


        if(openDialog.value){
            RegistroDatosSec(datos = datos, state = openDialog)
        }
        if(openDialogGastos.value){
            RegistroGastosSec(gastos = gastos, state = openDialogGastos)
        }
    }
}