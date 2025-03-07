package com.example.kt_ytal.Screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController, viewModel: ViewModelTal) {
    val estado by viewModel.uiState.collectAsState()
    Row(modifier = Modifier.padding(all = Dp(20F))) { Text("vamos"); navButton(navController) }
    Row(modifier = Modifier.padding(all = Dp(90F))) {
        Text("El valor del boton es: $${estado.botonTal}")
    }
    Row(modifier = Modifier.padding(all = Dp(80F))) { Button(onClick = {

        viewModel.setButtonValue(estado.botonTal + 1)

    }) { Text("+1") } }

}

@Composable
fun navButton(navController: NavController){
    Button(onClick = {  navController.navigate("info")}) { Text("Navigate") }
}