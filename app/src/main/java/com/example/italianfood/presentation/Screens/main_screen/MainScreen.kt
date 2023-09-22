package com.example.italianfood.presentation

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.italianfood.model.RecipeDataClass
import com.example.italianfood.presentation.Screens.main_screen.MainScreenViewModel


@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    viewModel: MainScreenViewModel = hiltViewModel(),
    toOneRecipeScreen: (String) -> Unit,
    configuration: Configuration
) {

    val state = viewModel.state
    val queryState = remember { mutableStateOf("") }
    val filteredRecipes = viewModel.getFilteredRecipes(queryState.value)


    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        topBar = {},
        bottomBar = { },


        ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            SearchBar(
                query = queryState.value,
                onQueryChange = { query -> queryState.value = query },
                onSearch = {},
                active = false,
                onActiveChange = { },
                placeholder = { Text(text = "Search") },
                trailingIcon = {
                    if (queryState.value.isNotEmpty()) {
                        Icon(
                            Icons.Default.Clear, contentDescription = null,
                            modifier = Modifier.clickable {
                                queryState.value = ""
                            }
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp),

                ) {}

/////////FILTERS/////////////////////////////////////////////////////////////////////////////////////////////////////
            Text("filters row")
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                //PASTA CHIP///////////////////////////////////////////////////////////////////////
                val chipSelectedPasta = remember { mutableStateOf(false) }
                FilterChip(
                    selected = chipSelectedPasta.value,
                    onClick = { chipSelectedPasta.value = !chipSelectedPasta.value },
                    label = { Text(text = "Pasta")},
                    leadingIcon = {
                        if (chipSelectedPasta.value){
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = null,
                            )
                        }else{}

                    }
                )
                Spacer(modifier = Modifier.padding(end = 4.dp))

                //PIZZA CHIP///////////////////////////////////////////////////////////////////////
                val chipSelectedPizza = remember { mutableStateOf(false) }
                FilterChip(
                    selected = chipSelectedPizza.value,
                    onClick = { chipSelectedPizza.value = !chipSelectedPizza.value },
                    label = { Text(text = "Pizza")},
                    leadingIcon = {
                        if (chipSelectedPizza.value){
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = null,
                            )
                        }else{}

                    }
                )
                Spacer(modifier = Modifier.padding(end = 4.dp))

                //Antipasti///////////////////////////////////////////////////////////////////////
                val chipSelectedAntipasti = remember { mutableStateOf(false) }
                FilterChip(
                    selected = chipSelectedAntipasti.value,
                    onClick = { chipSelectedAntipasti.value = !chipSelectedAntipasti.value },
                    label = { Text(text = "Antipasti")},
                    leadingIcon = {
                        if (chipSelectedAntipasti.value){
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = null,
                            )
                        }else{}

                    }
                )
                Spacer(modifier = Modifier.padding(end = 4.dp))

                //Desserts CHIP///////////////////////////////////////////////////////////////////////
                val chipSelectedDesserts = remember { mutableStateOf(false) }
                FilterChip(
                    selected = chipSelectedDesserts.value,
                    onClick = { chipSelectedDesserts.value = !chipSelectedDesserts.value },
                    label = { Text(text = "Desserts")},
                    leadingIcon = {
                        if (chipSelectedDesserts.value){
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = null,
                            )
                        }else{}

                    }
                )
                Spacer(modifier = Modifier.padding(end = 4.dp))

                //Breads CHIP///////////////////////////////////////////////////////////////////////
                val chipSelectedBreads = remember { mutableStateOf(false) }
                FilterChip(
                    selected = chipSelectedBreads.value,
                    onClick = { chipSelectedBreads.value = !chipSelectedBreads.value },
                    label = { Text(text = "Breads")},
                    leadingIcon = {
                        if (chipSelectedBreads.value){
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = null,
                            )
                        }else{}

                    }
                )
                Spacer(modifier = Modifier.padding(end = 4.dp))

                //Cocktail CHIP///////////////////////////////////////////////////////////////////////
                val chipSelectedCocktail = remember { mutableStateOf(false) }
                FilterChip(
                    selected = chipSelectedCocktail.value,
                    onClick = { chipSelectedCocktail.value = !chipSelectedCocktail.value },
                    label = { Text(text = "Cocktail")},
                    leadingIcon = {
                        if (chipSelectedCocktail.value){
                            Icon(
                                imageVector = Icons.Default.Done,
                                contentDescription = null,
                            )
                        }else{}

                    }
                )
                Spacer(modifier = Modifier.padding(end = 4.dp))






            }







            Column(modifier = Modifier.fillMaxSize()) {
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(
                        //check if there is a search query
                        if (queryState.value.isNotEmpty()) {
                            filteredRecipes
                        } else {
                            state.value
                        }
                    ) { recipe ->
                        OneRecipeItem(
                            oneRecipe = recipe,
                            onClick = {
                                toOneRecipeScreen(recipe.id.toString())
                            }

                        )

                        Spacer(modifier = Modifier.height(16.dp))

                    }

                }
            }


        }

    }
}




@Composable
fun OneRecipeItem(
    oneRecipe: RecipeDataClass,
    onClick: (RecipeDataClass) -> Unit
) {


//create
    Card(
        modifier = Modifier.clickable { onClick(oneRecipe) },
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {

        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .size(100.dp),
                painter = painterResource(id = oneRecipe.imageResId),
                contentDescription = null,
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, end = 4.dp)
                    .height(100.dp)
            ) {
                Text(
                    text = "${oneRecipe.dishTitle}",
                    maxLines = 2,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "${oneRecipe.description}", maxLines = 1, fontSize = 8.sp)
                Divider()

                // Iterate through ingredients and display each item
                val listOfIngredients = oneRecipe.ingredients
                val oneString = listOfIngredients.joinToString()
                val cleanFinalStr = oneString.replace("\n", " /")

                Text(
                    text = cleanFinalStr,
                    maxLines = 1,
                    fontSize = 8.sp
                )


//////////////////////////////////////
                val listOfInstructions = oneRecipe.instructions
                val oneStringInstructions = listOfInstructions.joinToString()
                val finalInstructions = oneStringInstructions.replace("\n", " /")
                Text(
                    text = "$finalInstructions",
                    maxLines = 1,
                    fontSize = 8.sp,
                )
                Log.d("instructions", finalInstructions)


                Divider()
                Spacer(modifier = Modifier.weight(0.5f))
                Text(
                    text = "Category: ${oneRecipe.category}",
                    maxLines = 1,
                    fontSize = 8.sp
                )
            }
        }
    }
}




