package fr.unica.snicolas.pizzapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.unica.snicolas.pizzapp.composables.CommonTopBar
import fr.unica.snicolas.pizzapp.viewmodel.OrderHistoryViewModel

@Composable
fun OrderHistoryScreen(
    onNavigateBack: () -> Unit,
    viewModel: OrderHistoryViewModel
) {
    LaunchedEffect(Unit) {
        viewModel.loadOrders()
    }

    Scaffold(
        topBar = {
            CommonTopBar(
                title = "Historique des commandes",
                onNavigateBack = onNavigateBack
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            items(viewModel.orders) { order ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = order.pizzaName,
                            style = MaterialTheme.typography.h6
                        )
                        Text(
                            text = "Prix: ${order.price} €",
                            style = MaterialTheme.typography.body1
                        )
                        if (order.extraCheese > 0) {
                            Text(
                                text = "Extra fromage: ${order.extraCheese}g",
                                style = MaterialTheme.typography.body2
                            )
                        }
                    }
                }
            }
        }
    }
}