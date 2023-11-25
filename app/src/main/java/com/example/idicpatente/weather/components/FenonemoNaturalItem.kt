package com.example.idicpatente.weather.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun FenomenoNaturalItem(
    state: MutableState<Boolean>
){

    val context = LocalContext.current
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
                    text = "Fenómeno Natural: ",
                    modifier = Modifier.weight(.3f)
                )
                Text(
                    text = "Fenómeno del niño ",
                    modifier = Modifier.weight(.3f)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Zonas Afectadas: ",
                    modifier = Modifier.weight(.3f)
                )
                Text(
                    text = "Norte del Perú ",
                    modifier = Modifier.weight(.3f)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Temporada: ",
                    modifier = Modifier.weight(.3f)
                )
                Text(
                    text = "Enero-Abril ",
                    modifier = Modifier.weight(.3f)
                )
            }

            Button(
                onClick = {
                    Toast.makeText(context, "Recomendaciones descargadas", Toast.LENGTH_SHORT).show()
                    state.value = false
                },
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(8.dp)
            ) {
                Text(text = "RECOMENDACIONES")
            }

        }



    }
}