package com.nayan.zwiggy.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nayan.zwiggy.model.FoodItem

@Entity(tableName = "orders")
data class OrderEntity(
    @PrimaryKey val resId: String,
    @ColumnInfo(name = "food_items") val foodItems: String
)
