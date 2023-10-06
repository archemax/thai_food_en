package com.example.italianfoodukraine.presentation.Screens.one_recipe_screen

import androidx.lifecycle.ViewModel
import com.example.italianfoodukraine.data.Repository
import com.example.italianfoodukraine.data.RepositoryTest
import com.example.italianfoodukraine.model.RecipeDataClass
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OneRecipeScreenViewModel @Inject constructor(): ViewModel() {
    private val recipes =  RepositoryTest.recipes

    private val _state = MutableStateFlow<RecipeDataClass?>(value = null)
    val state : StateFlow<RecipeDataClass?> = _state

    fun getOneRecipe (id: Int): RecipeDataClass?{
        return recipes.find {
            it.id == id
        }
    }

}