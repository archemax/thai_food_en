package com.example.thai_food_en.user_interface.Displays.one_recipe_display

import androidx.lifecycle.ViewModel
import com.example.thai_food_en.list_of_food.BigListOfFood
import com.example.thai_food_en.model.RecipeModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OneRecipeDispalyViewModel @Inject constructor(): ViewModel() {
    private val recipes =  BigListOfFood.recipes

    private val _state = MutableStateFlow<RecipeModel?>(value = null)
    val state : StateFlow<RecipeModel?> = _state

    fun getOneRecipe (id: Int): RecipeModel?{
        return recipes.find {
            it.recipeId == id
        }
    }

}