package com.example.textfield_botones_imagenes_otroscomponentes2025.ui.theme

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun MyStateHoisting() {
    var myText by remember {
        mutableStateOf("")
    }
    MyTextFieldSH(myText, { myText=it})
   // MyTextFieldSH(myText) { myText = it }
    Text(myText)
}


@Composable
fun MyTextFieldSH(name:String,onValueChanged:(String)->Unit) {
    TextField(value = name, onValueChange = {onValueChanged(it)})
}