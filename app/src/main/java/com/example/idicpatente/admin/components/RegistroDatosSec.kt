package com.example.idicpatente.admin.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.compose.runtime.remember

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegistroDatosSec(
    datos: MutableState<ArrayList<List<String>>>,
    state: MutableState<Boolean>
){
    /*datos.value.add(listOf("Tomate", "0.5", "2",  "1400"))*/

    val producto = remember { mutableStateOf("") }
    val precio = remember { mutableStateOf("") }
    val hectareas = remember { mutableStateOf("") }

    Dialog(
        onDismissRequest = { state.value = false },

        ){
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row {
                Text(text = "Producto: ")
                TextField(value = producto.value, onValueChange = {producto.value = it})
            }
            Row {
                Text(text = "Precio: ")
                TextField(value = precio.value, onValueChange = {precio.value = it})
            }
            Row {
                Text(text = "Hectareas: ")
                TextField(value = hectareas.value, onValueChange = {hectareas.value = it})
            }
            Button(
                onClick = {
                    val ganancias = precio.value.toFloat()*hectareas.value.toFloat()*1000
                    datos.value.add(listOf(producto.value, precio.value, hectareas.value, ganancias.toString()))
                    state.value = false
                }
            ) {
                Text(text = "Agregar")
            }
        }



    }

}