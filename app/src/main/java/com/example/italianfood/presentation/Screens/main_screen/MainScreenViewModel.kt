package com.example.italianfood.presentation.Screens.main_screen

import androidx.lifecycle.ViewModel
import com.example.italianfood.data.Repository
import com.example.italianfood.model.RecipeDataClass
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainScreenViewModel() : ViewModel() {
    private val repository = Repository

    private val _state = MutableStateFlow<List<RecipeDataClass>>(emptyList())
    val state: StateFlow<List<RecipeDataClass>> = _state

    init {
        _state.value = repository.recipes
    }

    fun getRecipes(): List<RecipeDataClass> {
        return repository.recipes
    }

}