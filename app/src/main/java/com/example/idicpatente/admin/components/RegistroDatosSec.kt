package com.example.idicpatente.admin.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
                .background(Color.White)
                .padding(12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Producto: ",
                    modifier = Modifier.weight(.3f)
                )
                TextField(
                    value = producto.value,
                    onValueChange = {producto.value = it},
                    singleLine = true,
                    modifier = Modifier.weight(.7f).border(1.dp, Color.LightGray, RoundedCornerShape(50)).background(
                        Color.Transparent),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        containerColor = Color.Transparent

                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            )  {
                Text(
                    text = "Precio: ",
                    modifier = Modifier.weight(.3f)
                )
                TextField(
                    value = precio.value,
                    onValueChange = {precio.value = it},
                    singleLine = true,
                    modifier = Modifier.weight(.7f).border(1.dp, Color.LightGray, RoundedCornerShape(50)).background(
                        Color.Transparent),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        containerColor = Color.Transparent

                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Hectáreas: ",
                    modifier = Modifier.weight(.3f)
                )
                TextField(
                    value = hectareas.value,
                    onValueChange = {hectareas.value = it},
                    singleLine = true,
                    modifier = Modifier.weight(.7f).border(1.dp, Color.LightGray, RoundedCornerShape(50)).background(
                        Color.Transparent),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        containerColor = Color.Transparent
                    )
                )
            }
            Button(
                onClick = {
                    val ganancias = precio.value.toFloat()*hectareas.value.toFloat()*1000
                    datos.value.add(listOf(producto.value, precio.value, hectareas.value, ganancias.toString()))
                    state.value = false
                },
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(8.dp)
            ) {
                Text(text = "Agregar")
            }
        }



    }

}