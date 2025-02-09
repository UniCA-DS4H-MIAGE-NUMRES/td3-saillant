package fr.unica.snicolas.pizzapp.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import fr.unica.snicolas.pizzapp.model.Pizza

data class CartItem(val pizza: Pizza, val extraCheese: Int)

class CartViewModel {
    private val _cartItems = mutableStateListOf<CartItem>()
    val cartItems: List<CartItem> get() = _cartItems

    fun addToCart(pizza: Pizza, extraCheese: Int) {
        _cartItems.add(CartItem(pizza, extraCheese))
    }

    fun getTotalPrice(): Double {
        return _cartItems.sumOf { it.pizza.price + (it.extraCheese * 0.05) }
    }

    fun clearCart() {
        _cartItems.clear()
    }
}
