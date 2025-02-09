package fr.unica.snicolas.pizzapp.navigation

sealed class Screen {
    data object Welcome : Screen()
    data object Menu : Screen()
    data class Pizza(val pizzaId: Int) : Screen()
    data object Cart : Screen()
    data object OrderHistory : Screen()
}