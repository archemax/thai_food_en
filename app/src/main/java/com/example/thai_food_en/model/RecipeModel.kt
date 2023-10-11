package com.example.thai_food_en.model

class RecipeModel(
    val id: Int, // Unique ID for the recipe
    val categoryOfFood: String,
    val dishTitle: String,
    val imageResId: Int,
    val description: String,
    val ingredients: List<String>,
    val instructions: List<String>
)
