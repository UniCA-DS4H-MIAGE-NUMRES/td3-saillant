package fr.unica.snicolas.pizzapp

import androidx.compose.runtime.*
import fr.unica.snicolas.pizzapp.navigation.Screen
import fr.unica.snicolas.pizzapp.screens.*
import fr.unica.snicolas.pizzapp.viewmodel.CartViewModel
import fr.unica.snicolas.pizzapp.viewmodel.PizzaViewModel

@Composable
fun App() {
    var currentScreen by remember { mutableStateOf<Screen>(Screen.Welcome) }
    val cartViewModel = remember { CartViewModel() }
    val pizzaViewModel = remember { PizzaViewModel() }

    when (val screen = currentScreen) {
        is Screen.Welcome -> WelcomeScreen(
            onNavigateToMenu = { currentScreen = Screen.Menu },
            onNavigateToCart = { currentScreen = Screen.Cart }
        )

        is Screen.Menu -> MenuScreen(
            onNavigateBack = { currentScreen = Screen.Welcome },
            onPizzaClick = { pizzaId -> currentScreen = Screen.Pizza(pizzaId) },
            pizzaViewModel = pizzaViewModel
        )

        is Screen.Pizza -> PizzaScreen(
            pizzaId = screen.pizzaId,
            onNavigateBack = { currentScreen = Screen.Menu },
            cartViewModel = cartViewModel,
            pizzaViewModel = pizzaViewModel
        )

        is Screen.Cart -> CartScreen(
            onNavigateBack = { currentScreen = Screen.Menu },
            cartViewModel = cartViewModel
        )
    }
}