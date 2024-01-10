package edu.villablanca.catalogo.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DemoText(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "ejemplo text")
    }
}