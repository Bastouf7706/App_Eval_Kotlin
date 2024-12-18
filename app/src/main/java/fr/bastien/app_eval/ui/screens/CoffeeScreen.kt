package fr.bastien.app_eval.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

//Création de l'écran de démarrage
@Composable
fun CoffeeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Start your day with a lovely coffee",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 32.dp)
        )
        Button(
            onClick = {
                navController.navigate("CoffeeImageScreen")//Direction vers l'écran de l'image
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Random Coffee")
        }
    }
}

// Preview de l'écran de démarrage
@Preview(showBackground = true)
@Composable
fun PreviewCoffeeScreen() {
    val navController = rememberNavController()
    CoffeeScreen(navController = navController)
}

