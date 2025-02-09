package fr.unica.snicolas.pizzapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import fr.unica.snicolas.pizzapp.model.OrderEntity

@Database(entities = [OrderEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun orderDao(): OrderDao
}