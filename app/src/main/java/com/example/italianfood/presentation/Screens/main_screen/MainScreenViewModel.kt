package com.example.italianfood.presentation.Screens.main_screen

import androidx.lifecycle.ViewModel
import com.example.italianfood.data.Repository
import com.example.italianfood.model.RecipeDataClass
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel

class MainScreenViewModel @Inject constructor() : ViewModel() {
    private val repository = Repository

    private val _state = MutableStateFlow<List<RecipeDataClass>>(emptyList())
    val state: StateFlow<List<RecipeDataClass>> = _state

    init {
        _state.value = repository.recipes
    }

    fun getFilteredRecipes(query: String): List<RecipeDataClass> {
        return state.value.filter { oneRecipe ->
            oneRecipe.dishTitle.contains(query, ignoreCase = true) ||
                    oneRecipe.description.contains(query, ignoreCase = true)
        }

        fun getRecipes(): List<RecipeDataClass> {
            return repository.recipes
        }
    }
}

