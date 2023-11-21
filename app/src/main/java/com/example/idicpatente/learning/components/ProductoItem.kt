package com.example.idicpatente.learning.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ProductoItem(
    producto : String
){
    val openDialog = remember { mutableStateOf(false)  }
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp),
        elevation = 4.dp,
        onClick = {
            openDialog.value = true
        }
    ) {
        Column(modifier = Modifier.fillMaxWidth() ){
            Text(text = producto)
            Text(text = "Marzo - Agosto")
        }
    }
    if ( openDialog.value ){
        ProductoComponent(producto, openDialog)
    }
}
