package fr.unica.snicolas.pizzapp.model

data class Pizza(
    val id: Int,
    val name: String,
    val imageResource: String,
    val price: Double,
    val ingredients: List<String>
)