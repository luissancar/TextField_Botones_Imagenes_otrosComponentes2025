package com.example.textfield_botones_imagenes_otroscomponentes2025


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MyButton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,          // Color de fondo cuando está habilitado
            contentColor = Color.White,           // Color del texto o contenido cuando está habilitado
            disabledContainerColor = Color.Gray,  // Color de fondo cuando está deshabilitado
            disabledContentColor = Color.DarkGray // Color del texto cuando está deshabilitado
        ),
        border = BorderStroke(3.dp,Color.Yellow)
    ) {
        Column {
            Text("Pulsar")
            Text("Pulsar")
        }
    }
}