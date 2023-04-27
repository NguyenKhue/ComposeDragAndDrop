package com.example.draganddrop

import androidx.annotation.DrawableRes

data class AppItem(val id: Int, val name: String, @DrawableRes val image: Int)

val appList = listOf(
    AppItem(1, "Pizza", R.drawable.food_pizza),
    AppItem(2, "French toast", R.drawable.food_toast),
    AppItem(3, "Chocolate cake", R.drawable.food_cake),
)

data class DropItem(val id: Int, val name: String, @DrawableRes var image: Int)

val persons = listOf(
    DropItem(1, "", R.drawable.baseline_add_24),
    DropItem(2, "", R.drawable.baseline_add_24),
    DropItem(3, "", R.drawable.baseline_add_24),
)