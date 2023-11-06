package com.imaima.thai_food_en.user_interface.Displays.main_display

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.imaima.thai_food_en.list_of_food.BigListOfFood
import com.imaima.thai_food_en.model.RecipeModel
import dagger.hilt.android.lifecycle.HiltViewModel

import javax.inject.Inject

@HiltViewModel
class MainDisplayViewModel @Inject constructor(
    private val myViewModelRepo: BigListOfFood,

    ) : ViewModel() {

    private var _state = mutableStateOf<List<RecipeModel>>(emptyList())
    val state: State<List<RecipeModel>> = _state

    init {
        _state.value =  myViewModelRepo.recipes
    }



    fun myFilter(
        query: String,
        category: String
    ): List<RecipeModel> {

        val filteredRecipes =
            _state.value.filter { oneRecipe ->

                oneRecipe.categoryOfFood.contains(category, ignoreCase = true)
                        &&
                        (oneRecipe.dishTitle.contains(query, ignoreCase = true)
                                || oneRecipe.description
                            .contains(query, ignoreCase = true))
            }

        return filteredRecipes
    }

}

