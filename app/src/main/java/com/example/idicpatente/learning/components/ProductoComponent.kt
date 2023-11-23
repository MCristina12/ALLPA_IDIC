package com.example.idicpatente.learning.components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.idicpatente.R

@Composable
fun ProductoComponent(
    producto : String,
    state : MutableState<Boolean>
){
    Dialog(
        onDismissRequest = { state.value = false },
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(12.dp)

        ) {
            Text(
                text = producto.uppercase(),
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Card(
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth().padding(end = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Guía general de cultivo",
                        modifier = Modifier.padding(12.dp),
                        fontWeight = FontWeight.Light
                    )
                    Image( painterResource(id = R.drawable.baseline_download_24), contentDescription = "" ,
                        modifier = Modifier.clickable(enabled = true) {

                        })
                }
            }
            Card(
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            )  {
                Row (
                    modifier = Modifier.fillMaxWidth().padding(end = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Fertilizantes y aditivos",
                        modifier = Modifier.padding(12.dp),
                        fontWeight = FontWeight.Light
                    )
                    Image(
                        painterResource(id = R.drawable.baseline_download_24),
                        contentDescription = "" ,
                        modifier = Modifier.clickable(enabled = true) {

                        }
                    )
                }

            }
            Card(
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            )  {
                Row (
                    modifier = Modifier.fillMaxWidth().padding(end = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Productos y enfermedades",
                        modifier = Modifier.padding(12.dp),
                        fontWeight = FontWeight.Light
                    )
                    Image( painterResource(id = R.drawable.baseline_download_24), contentDescription = "" ,
                        modifier = Modifier.clickable(enabled = true) {

                        })
                }

            }
        }
    }
}