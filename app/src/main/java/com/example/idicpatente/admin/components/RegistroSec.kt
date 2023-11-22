package com.example.idicpatente.admin.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RegistroSec(){
    val openDialog = remember { mutableStateOf(false)  }

    val datos = remember {
        mutableStateOf(
            arrayListOf(
                listOf("Producto", "Precio", "Hectareas", "Ganancias"),
                listOf("Papa", "0.6", "3",  "1500"),
                listOf("Camote", "0.8", "1",  "1200")
            )
        )
    }


    Column {
        Button(
            onClick = { openDialog.value = true }
        ) {
            Text(text = "Ingresa los datos")
        }
        for (fila in datos.value) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)

            ) {
                for (celda in fila) {
                    var weight = .3f
                    if (celda == "Producto" || celda == "Hectareas" || celda == "Ganancias"){
                        weight = .3f
                    }else{
                        weight = .25f
                    }
                    Text(
                        text = celda,
                        modifier = Modifier
                            .padding(8.dp)
                            .weight(weight)
                    )
                }
            }
        }

        if(openDialog.value){
            RegistroDatosSec(datos = datos, state = openDialog)
        }
    }
}