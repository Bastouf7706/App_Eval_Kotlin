package fr.bastien.app_eval.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import fr.bastien.app_eval.R

//Création de l'écran pour le café
@Composable
fun CoffeeImageScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.coffee_1),
            contentDescription = "Image of a coffee",
            modifier = Modifier.fillMaxSize()
        )
    }
}

//Preview de l'écran du café
@Preview(showBackground = true)
@Composable
fun PreviewCoffeeImageScreen() {
    CoffeeImageScreen()
}
