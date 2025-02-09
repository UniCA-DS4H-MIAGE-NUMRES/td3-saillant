package fr.unica.snicolas.pizzapp.data

import fr.unica.snicolas.pizzapp.model.Order

interface OrderRepository {
    suspend fun addOrder(order: Order)
    suspend fun getAllOrders(): List<Order>
}