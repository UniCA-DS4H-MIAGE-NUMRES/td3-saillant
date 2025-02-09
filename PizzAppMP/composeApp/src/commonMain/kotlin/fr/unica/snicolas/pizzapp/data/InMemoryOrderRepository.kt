package fr.unica.snicolas.pizzapp.data

import fr.unica.snicolas.pizzapp.model.Order

class InMemoryOrderRepository : OrderRepository {
    private val orders = mutableListOf<Order>()
    private var nextId = 1

    override suspend fun addOrder(order: Order) {
        orders.add(order.copy(id = nextId++))
    }

    override suspend fun getAllOrders(): List<Order> {
        return orders.toList()
    }
}