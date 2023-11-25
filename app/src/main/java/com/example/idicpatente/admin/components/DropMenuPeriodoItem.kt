package com.example.idicpatente.admin.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ExposedDropdownMenuDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun DropMenuPeriodoItem (){


    var isExpanded = remember {
        mutableStateOf(false)
    }

    var gender =  remember {
        mutableStateOf("")
    }

    ExposedDropdownMenuBox(
        expanded = isExpanded.value,
        onExpandedChange = {newBoolean ->
            isExpanded.value = newBoolean
        },
        modifier = Modifier.padding(8.dp)
    ) {

        TextField(
            value = gender.value,
            onValueChange = {},
            readOnly = true,
            placeholder = {
                Text(text = "Periodo")
            },
            colors =  TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedLabelColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                containerColor = Color.Transparent

            ),
            modifier = Modifier
                .border(1.dp, Color.LightGray, RoundedCornerShape(50))
                .background(
                    Color.Transparent
                )
                .menuAnchor()
                .padding(0.dp)
                .width(150.dp)
                .height(55.dp),
            singleLine = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded.value)
            }
        )

        ExposedDropdownMenu(
            expanded = isExpanded.value,
            onDismissRequest = {
                isExpanded.value = false
            }
        ) {
            DropdownMenuItem(
                text = {
                    Text(text = "2023")
                },
                onClick = {
                    gender.value = "2023"
                    isExpanded.value = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "2022")
                },
                onClick = {
                    gender.value = "2022"
                    isExpanded.value = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "2021")
                },
                onClick = {
                    gender.value = "2021"
                    isExpanded.value = false
                }
            )
        }

    }
}