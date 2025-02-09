package fr.unica.snicolas.pizzapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.unica.snicolas.pizzapp.composables.CommonTopBar
import fr.unica.snicolas.pizzapp.composables.PizzaCard
import fr.unica.snicolas.pizzapp.viewmodel.PizzaViewModel

@Composable
fun MenuScreen(
    onNavigateBack: () -> Unit,
    onPizzaClick: (Int) -> Unit,
    pizzaViewModel: PizzaViewModel
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
            LazyColumn {
                items(pizzaViewModel.pizzas) { pizza ->
                    PizzaCard(
                        pizza = pizza,
                        onClick = { onPizzaClick(pizza.id) }
                    )
                }
            }
        }
    }
}
