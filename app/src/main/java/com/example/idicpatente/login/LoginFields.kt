package com.example.idicpatente.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.R.color.holo_orange_dark
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.core.content.ContextCompat.startActivity
import com.example.idicpatente.LoginActivity
import com.example.idicpatente.MainActivity
import com.example.idicpatente.R

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun LoginFields(

){


    val name = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    val keyboardController = LocalSoftwareKeyboardController.current
    val context = LocalContext.current
    var passwordVisible =  { mutableStateOf(false) }
    val or1 = Color(0xFFE65100)
    val or2 = Color(0xFFFF9800)

    //La columna para dividirlo de la manera definida necesita contener 2 columnas hijas
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff045658)),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5f),
        ){
            // imagen
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.baseline_spa_24),
                    contentDescription = "Shpiel",
                    Modifier
                        .size(size = 400.dp)
                        .padding(30.dp)
                )

            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f),
        ){
//Input texts
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Text(
                    text = "A L L P A",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 12.dp),
                    fontWeight = FontWeight.Medium

                )

                TextField(
                    label = {Text(text = "Correo electrónico", color = Color.White)},
                    value = name.value,
                    onValueChange = {name.value = it},
                    singleLine = true,
                    modifier = Modifier
                        .weight(.3f)
                        .border(1.dp, Color.LightGray, RoundedCornerShape(50))
                        .background(
                            Color.Transparent
                        ),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        containerColor = Color.Transparent
                    )
                )
                Divider(modifier = Modifier.height(12.dp), color = Color.Transparent)

                TextField(
                    label = {Text(text = "Contraseña", color = Color.White)},
                    value = password.value,
                    onValueChange = {password.value = it},
                    singleLine = true,
                    modifier = Modifier
                        .weight(.3f)
                        .border(1.dp, Color.LightGray, RoundedCornerShape(50))
                        .background(
                            Color.Transparent
                        ),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedLabelColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent,
                        containerColor = Color.Transparent
                    )
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.1f)
                        .padding(top = 16.dp),
                ){
                    Column(
                        modifier = Modifier,
                        horizontalAlignment =  Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "¿Olvidaste tu contraseña?",
                            color = Color.White,
                            modifier = Modifier
                                .padding(bottom = 8.dp)
                                .clickable {
                                    val intent = Intent(context, MainActivity::class.java)
                                    context.startActivity(intent)
                                }
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),

                    ){
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = 20.dp),
                        horizontalAlignment =  Alignment.CenterHorizontally
                    ) {
                        Button(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 70.dp),
                            onClick = {
                                println("boton")
                                val intent = Intent(context, MainActivity::class.java)
                                context.startActivity(intent)
                            },
                            colors = ButtonDefaults.buttonColors(
                                contentColor = Color.White,
                                containerColor = Color(0xFFE65100)
                            )
                        ){
                            Text(text = "Ingresar")
                        }
                        Text(
                            text = "Regístrate",
                            color = Color.White,
                            modifier = Modifier.clickable {
                                val intent = Intent(context, MainActivity::class.java)
                                context.startActivity(intent)
                            }
                        )
                    }

                }

            }
        }
        // olvido su contraseñla


    }
}


@Composable
@Preview(showBackground = true)
// fondo blanco
fun test(){
    LoginFields()
}