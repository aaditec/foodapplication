package com.example.tour_guide_nepal.ENTITY

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vehicles")
data class Vehicle(
    @PrimaryKey @ColumnInfo(name = "id") val id: Long,
    val name: String,
    val price: Double,
    val availability: String,
    val imageId: Int


) {
    override fun toString(): String {
        return "Vehicle(id=$id, name='$name', price=$price, availability='$availability', imageId=$imageId)"
    }
}
