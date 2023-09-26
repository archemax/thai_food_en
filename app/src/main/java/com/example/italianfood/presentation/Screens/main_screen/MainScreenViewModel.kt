package com.example.italianfood.presentation.Screens.main_screen

import androidx.compose.runtime.mutableStateOf
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

    //1) this is a list of selected categories (from the main screen)
    private val selectedCategories = mutableStateOf(emptyList<String>())

    init {
        _state.value = repository.recipes
    }

    fun getFilteredRecipes(query: String) :List<RecipeDataClass> {
        // 2) here i will filter recipes based on search query and selected categories
        val filteredList = _state.value.filter { oneRecipe ->
            oneRecipe.dishTitle.contains(query, ignoreCase = true)
                    || oneRecipe.description.contains(query, ignoreCase = true)
        }
        return filteredList

    }

    // get selected recipes from Main screen
    fun toggleCategorySelection(category: String): List<String> {
        selectedCategories.value = if (category in selectedCategories.value) {
            selectedCategories.value - category
        } else {
            selectedCategories.value + category
        }
        return selectedCategories.value
    }


}

