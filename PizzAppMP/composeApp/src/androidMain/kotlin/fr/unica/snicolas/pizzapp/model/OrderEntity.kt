package fr.unica.snicolas.pizzapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "orders")
data class OrderEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val pizzaName: String,
    val price: Double,
    val extraCheese: Int
) {
    fun toOrder(): Order = Order(
        id = id,
        pizzaName = pizzaName,
        price = price,
        extraCheese = extraCheese
    )
}