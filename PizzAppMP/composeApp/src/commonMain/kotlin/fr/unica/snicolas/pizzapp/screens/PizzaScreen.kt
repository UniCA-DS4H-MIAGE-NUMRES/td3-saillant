package fr.unica.snicolas.pizzapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.unica.snicolas.pizzapp.composables.CommonTopBar
import fr.unica.snicolas.pizzapp.viewmodel.CartViewModel
import fr.unica.snicolas.pizzapp.viewmodel.PizzaViewModel

@Composable
fun PizzaScreen(
    pizzaId: Int,
    onNavigateBack: () -> Unit,
    cartViewModel: CartViewModel,
    pizzaViewModel: PizzaViewModel
) {
    val pizza = pizzaViewModel.pizzas.first { it.id == pizzaId }
    var extraCheese by remember { mutableStateOf(0f) }

    Scaffold(
        topBar = {
            CommonTopBar(
                title = "Pizza Menu",
                onNavigateBack = onNavigateBack
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    cartViewModel.addToCart(pizza, extraCheese.toInt())
                }
            ) {
                Text("+")
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Image placeholder
            Box(
                modifier = Modifier
                    .size(200.dp)
                    .fillMaxWidth()
            )

            Text(text = pizza.name, style = MaterialTheme.typography.h5)
            Text(text = "Price: ${pizza.price} €", style = MaterialTheme.typography.body1)
            Text(text = "Extra Cheese: ${extraCheese.toInt()}g", style = MaterialTheme.typography.body1)

            Slider(
                value = extraCheese,
                onValueChange = { extraCheese = it },
                valueRange = 0f..100f,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}
