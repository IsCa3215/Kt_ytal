package com.example.kt_ytal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kt_ytal.Screens.InfoScreen
import com.example.kt_ytal.Screens.MainScreen
import com.example.kt_ytal.Screens.ViewModelTal
import com.example.kt_ytal.ui.theme.Kt_ytalTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val navController = rememberNavController();
            val viewModel: ViewModelTal = viewModel()
            Kt_ytalTheme {
                NavHost(navController = navController, startDestination = "main"){
                    composable("main") { MainScreen(navController, viewModel) }
                    composable("info") { InfoScreen(viewModel) }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kt_ytalTheme {
        Greeting("Android")
    }
}