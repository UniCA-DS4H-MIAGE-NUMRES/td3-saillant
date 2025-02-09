package fr.unica.snicolas.pizzapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import fr.unica.snicolas.pizzapp.model.OrderEntity

@Dao
interface OrderDao {
    @Insert
    suspend fun insertOrder(order: OrderEntity)

    @Query("SELECT * FROM orders")
    suspend fun getAllOrders(): List<OrderEntity>
}