package com.example.idicpatente.learning.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog

@Composable
fun ProductoComponent(
    producto : String,
    state : MutableState<Boolean>
){
    Dialog(
        onDismissRequest = { state.value = false },

    ){
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = producto)
            Card {
                Text(text = "Guía general de cultivo")
            }
            Card {
                Text(text = "Fertilizantes y aditivos")
            }
            Card {
                Text(text = "Productos y enfermedades")
            }
        }
    }
}