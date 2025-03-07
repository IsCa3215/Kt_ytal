package com.example.kt_ytal.Screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun InfoScreen(viewModel: ViewModelTal){

    val estado by viewModel.uiState.collectAsState()

    Row(modifier = Modifier.padding(Dp(20F))){
        Text("He recibido la información de la pantalla anterior: ${estado.botonTal}")
    }
    Row {
        Button(onClick = {viewModel.botonRanding()}) { }
    }
}