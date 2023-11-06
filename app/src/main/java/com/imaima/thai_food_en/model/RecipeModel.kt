package com.imaima.thai_food_en.model

class RecipeModel(
    val recipeId: Int,
    val categoryOfFood: String,
    val dishTitle: String,
    val imageResId: Int,
    val description: String,
    val ingredients: Array<String>,
    val instructions: Array<String>
)
