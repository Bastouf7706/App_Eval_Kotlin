package fr.bastien.app_eval

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.bastien.app_eval.ui.screens.CoffeeImageScreen
import fr.bastien.app_eval.ui.screens.CoffeeScreen
import fr.bastien.app_eval.ui.theme.App_EvalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App_EvalTheme {
                MainApp()
            }
        }
    }
}

//Création du NavHost et des différents écrans
@Composable
fun MainApp() {
    val navController = rememberNavController() // Initialisation du NavController
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "coffee_screen", // Ecran par défaut
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("coffee_screen") {
                CoffeeScreen(navController = navController)
            }
            composable("coffee_image_screen") {
                CoffeeImageScreen()
            }
        }
    }
}

//Preview de l'écran principal
@Preview(showBackground = true)
@Composable
fun PreviewMainApp() {
    App_EvalTheme {
        MainApp()
    }
}
