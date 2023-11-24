package com.example.idicpatente.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
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
import androidx.compose.ui.graphics.toArgb
import com.example.idicpatente.R

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LoginFields(
    name:String,
    password:String,
    onNameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onLoginClick: () -> Unit,
    onRegisterClick: () -> Unit
){
    val keyboardController = LocalSoftwareKeyboardController.current
    val context = LocalContext.current
    var passwordVisible =  { mutableStateOf(false) }
    val or1 = Color(0xFFE65100)
    val or2 = Color(0xFFFF9800)
    //La columna para dividirlo de la manera definida necesita contener 2 columnas hijas
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f),
        ){
            // imagen
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.baseline_person_24),
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
                .weight(0.6f),
        ){
//Input texts
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp, top = 0.dp, end = 50.dp, bottom = 0.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = {keyboardController?.hide()}),
                    value = name,
                    onValueChange = onNameChange,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Green,
                        unfocusedBorderColor = Color.Gray),
                    label = { Text(text = "Correo elctrónico")})

                TextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp, top = 0.dp, end = 50.dp, bottom = 0.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = {keyboardController?.hide()}),
                    value = password,
                    onValueChange = onPasswordChange,
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Red,
                        unfocusedBorderColor = Color.Red),
                    label = { Text(text = "Contraseña")},
                    visualTransformation = PasswordVisualTransformation()
                    )

            }
        }
        // olvido su contraseñla
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.1f),
        ){
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Olvidaste tu contraseña?",
                    modifier = Modifier.clickable {
                        onRegisterClick()
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
                        onLoginClick()
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Red,
                        contentColor = Color.White
                    )
                ){
                    Text(text = "Ingresar")
                }
                Text(
                    text = "Registrate",
                    modifier = Modifier.clickable {
                        onRegisterClick()
                    }
                )
            }

        }
        Divider()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.Center
        ){


        }
    }
}


@Composable
@Preview(showBackground = true)
// fondo blanco
fun test(){
    LoginFields(
        name = "",
        password = "",
        onNameChange = {},
        onPasswordChange = {},
        onLoginClick = {},
        onRegisterClick = {}
    )
}