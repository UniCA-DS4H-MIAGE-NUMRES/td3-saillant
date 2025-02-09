package fr.unica.snicolas.pizzapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.unica.snicolas.pizzapp.composables.CommonTopBar
import fr.unica.snicolas.pizzapp.viewmodel.CartViewModel

@Composable
fun CartScreen(
    onNavigateBack: () -> Unit,
    cartViewModel: CartViewModel
) {
    Scaffold(
        topBar = {
            CommonTopBar(
                title = "Pizza Menu",
                onNavigateBack = onNavigateBack
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            if (cartViewModel.cartItems.isEmpty()) {
                Text(
                    text = "Votre panier est vide",
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.fillMaxWidth()
                )
            } else {
                cartViewModel.cartItems.forEach { item ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = item.pizza.name, style = MaterialTheme.typography.body1)
                        Text(text = "${item.pizza.price} €", style = MaterialTheme.typography.body1)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Divider()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Total:", style = MaterialTheme.typography.h6)
                    Text(
                        text = "${(cartViewModel.getTotalPrice() * 100).toInt() / 100.0} €",
                        style = MaterialTheme.typography.h6
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = { /* TODO: Checkout logic */ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Payer la commande")
                }
            }
        }
    }
}
