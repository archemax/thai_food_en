package com.example.italianfood.presentation.Screens.one_recipe_screen

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.italianfood.data.Repository
import com.example.italianfood.model.RecipeDataClass
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OneRecipeScreenViewModel @Inject constructor(): ViewModel() {
    private val recipes =  Repository.recipes

    private val _state = MutableStateFlow<RecipeDataClass?>(value = null)
    val state : StateFlow<RecipeDataClass?> = _state

    fun getOneRecipe (id: Int): RecipeDataClass?{
        return recipes.find {
            it.id == id
        }
    }

}