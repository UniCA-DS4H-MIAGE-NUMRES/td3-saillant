package fr.unica.snicolas.pizzapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(onNavigateToMenu: () -> Unit, onNavigateToCart: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = onNavigateToMenu,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        ) {
            Text("Voir le menu")
        }

        Button(
            onClick = onNavigateToCart,
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        ) {
            Text("Voir le panier")
        }

        Button(
            onClick = { /* TODO: Implement checkout */ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Payer la commande")
        }
    }
}
