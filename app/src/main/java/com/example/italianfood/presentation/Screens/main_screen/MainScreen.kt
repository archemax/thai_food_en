package com.example.italianfood.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.italianfood.model.RecipeDataClass
import com.example.italianfood.presentation.Screens.main_screen.MainScreenViewModel



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    viewModel: MainScreenViewModel = hiltViewModel()
) {

    val state = viewModel.state
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        topBar = { },
        bottomBar = { Text(text = "BottomBar") }

    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            SearchBar(query = "",
                onQueryChange = {},
                onSearch = {},
                active = false,
                onActiveChange = {},
                placeholder = { Text(text = "Search") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {}

            Text("filters row")
            Column(modifier = Modifier.fillMaxSize()) {
                LazyColumn(modifier = Modifier.fillMaxSize()){
                    items(state.value){recipe->
                         Text(text = recipe.dishTitle)

                    }

                }
            }


        }

    }




}
@Composable
fun OneRecipeItem(oneRecipe: RecipeDataClass){

//create
    Card() {
        
    }
}







