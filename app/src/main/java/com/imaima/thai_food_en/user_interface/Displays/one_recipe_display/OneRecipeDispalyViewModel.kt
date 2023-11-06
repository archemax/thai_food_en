package com.imaima.thai_food_en.user_interface.Displays.one_recipe_display

import androidx.lifecycle.ViewModel
import com.imaima.thai_food_en.list_of_food.BigListOfFood
import com.imaima.thai_food_en.model.RecipeModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OneRecipeDispalyViewModel @Inject constructor(private val myViewModelRepo: BigListOfFood

) : ViewModel() {

    private val recipes = myViewModelRepo.recipes

    private val _state = MutableStateFlow<RecipeModel?>(value = null)
    val state: StateFlow<RecipeModel?> = _state

    fun getOneRecipe(id: Int): RecipeModel? {
        return recipes.find {
            it.recipeId == id
        }
    }

}