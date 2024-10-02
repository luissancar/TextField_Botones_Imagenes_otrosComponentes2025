package com.example.textfield_botones_imagenes_otroscomponentes2025

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun MyTextField() {
    var myText by remember { mutableStateOf("") }
    TextField(value = myText, onValueChange = { myText = it })
}

@Composable
fun MyTextField2() {
    var myText by remember { mutableStateOf("") }
    TextField(
        value = myText,
        onValueChange = {
            myText = if (it.contains("a")) {
                it.replace("a", "A")
            } else {
                it
            }
        },
        label = { Text(text = "Introducir Dato") })

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyOutLinedTextField() {
    var myText by remember { mutableStateOf("") }
    OutlinedTextField(
        value = myText,
        onValueChange = { myText = it },
        label = { Text("Introducir") },
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Black, // Color del texto cuando está enfocado
            unfocusedTextColor = Color.Gray, // Color del texto cuando no está enfocado
            focusedContainerColor = Color.LightGray, // Color de fondo cuando está enfocado
            unfocusedContainerColor = Color.Yellow, // Color de fondo cuando no está enfocado
            focusedIndicatorColor = Color.Blue, // Color del borde cuando está enfocado
            unfocusedIndicatorColor = Color.Red, // Color del borde cuando no está enfocado
            cursorColor = Color.Green // Color del cursor
        )
    )
}





























