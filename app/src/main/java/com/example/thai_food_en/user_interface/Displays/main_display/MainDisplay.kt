package com.example.thai_food_en.user_interface

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.SelectableChipElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.thai_food_en.R
import com.example.thai_food_en.model.RecipeModel
import com.example.thai_food_en.user_interface.Displays.main_display.MainDisplayViewModel

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyMainDisplay(
    configurationOfScreen: Configuration,
    viewModel: MainDisplayViewModel = hiltViewModel(),
    toOneRecipeScreen: (String) -> Unit,
) {
    val state = viewModel.state
    val queryState = rememberSaveable { mutableStateOf("") }
    val selectedCategory = rememberSaveable { mutableStateOf("") }
    val finalFilteredList =
        viewModel.myFilter(query = queryState.value, category = selectedCategory.value)


    val categoriesOfFood = listOf(
        "Антипасти",
        "Паста",
        "Піца",
        "Основні страви",
        "Супи",
        "Гарніри",
        "Десерти",
        "Хліб",
        "Коктейль"
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {},
        bottomBar = { },
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(top = 0.dp, bottom = 0.dp, start = 8.dp, end = 8.dp)
//
        ) {
            SearchBar(
                query = queryState.value,
                onQueryChange = { query -> queryState.value = query },
                onSearch = {},
                active = false,
                onActiveChange = { },
                placeholder = { Text(text = "Пошук...") },
                colors = SearchBarDefaults.colors(containerColor = Color(0xFFECEFFB)),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.search_leading_icon),
                        contentDescription = "search circkle"
                    )
                },
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
                    .padding(top = 24.dp, start = 0.dp, end = 0.dp)
            ) {}


            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.whatShallWeCook),
                style = MaterialTheme.typography.headlineLarge
            )

            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                categoriesOfFood.forEach { category ->
                    val isSelected = category == selectedCategory.value
                    val myElevation: SelectableChipElevation = if (isSelected) {
                        FilterChipDefaults.filterChipElevation(8.dp)
                    } else {
                        FilterChipDefaults.filterChipElevation(0.dp)
                    }

                    ElevatedFilterChip(
                        selected = isSelected,
                        onClick = {
                            selectedCategory.value = if (isSelected) "" else category
                        },
                        elevation = myElevation,
                        label = {
                            Text(
                                text = category,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 20.sp,
                                    fontFamily = FontFamily(Font(R.font.montserrat_semi_bold)),
                                    fontWeight = FontWeight(500),
                                    color = Color(0xFF3F486C),
                                    textAlign = TextAlign.Center,
                                    letterSpacing = 0.1.sp,
                                )
                            )
                        },


                        border = FilterChipDefaults.filterChipBorder(
                            borderColor = Color(0xFF848EB2),
                            selectedBorderColor = Color(0xFF848EB2), selectedBorderWidth = 1.dp
                        ),
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = Color(0xFFECEFFB)
                        ),


                        )
                    Spacer(modifier = Modifier.padding(end = 4.dp))

                }
            }

////Recommended for you//////////////////////////////////////////////////////////////////////////////////

            Text(
                text = stringResource(R.string.Recommendations),
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.height(12.dp))
//////Recommended for you//////////////////////////////////////////////////////////////////////////////////


//////LAZY COLUMN//////////////////////////////////////////////////////////////////////////////////////////////////
            Column(modifier = Modifier.fillMaxSize()) {
                LazyColumn(modifier = Modifier.fillMaxSize(),
                 ) {
                    items(
                        if (selectedCategory.value.isNotEmpty() || queryState.value.isNotEmpty()) {
                            finalFilteredList
                        } else {
                            state.value
                        }
                    ) { recipe ->
                        OneRecipeItem(
                            oneRecipe = recipe,
                            onClick = {
                                toOneRecipeScreen(recipe.recipeId.toString())
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
    oneRecipe: RecipeModel,
    onClick: (RecipeModel) -> Unit
) {
//create
    Card(
        modifier = Modifier
            .aspectRatio(2.5f)
            .clickable { onClick(oneRecipe) },
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFECEFFB)),
    ) {

        Row(modifier = Modifier.fillMaxHeight()) {
            Image(

                modifier = Modifier
                    .size(158.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.FillHeight,
                painter = painterResource(id = oneRecipe.imageResId),
                contentDescription = null,
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, end = 16.dp, top = 11.dp)
                    .height(100.dp)
            ) {
                Text(
                    text = oneRecipe.dishTitle,
                    maxLines = 2,
                    style = MaterialTheme.typography.headlineSmall
                )
                Spacer(modifier = Modifier.size(8.dp))
                ////////////////////////description in card//////////////////////////////////////////////
                Text(
                    text = oneRecipe.description,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.bodyMedium

                )
                Spacer(modifier = Modifier.size(8.dp))
//INGREDIENTS//////////////////////////                //

                // Iterate through ingredients and display each item
//                val listOfIngredients = oneRecipe.ingredients
//                val toMutList = listOfIngredients.toMutableList()
//                val noFirstElRemoved = toMutList.drop(1)
//                val joinedToString = noFirstElRemoved.joinToString("")
//                val stringNon = joinedToString.replace("\n", " ")
//                val trimmed = stringNon.trim()

                ////////////lower icon///////////////////////////////////////////////////
                Spacer(modifier = Modifier.weight(0.5f))
                Row(
                    modifier = Modifier.padding(bottom = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.category_icon),
                        contentDescription = null,
                        tint = Color(0xFF3F486C)
                    )
                    Text(
                        text = "  ${oneRecipe.categoryOfFood}",
                        maxLines = 1,
                        style = TextStyle(
                            fontSize = 8.sp,
                            lineHeight = 16.sp,
                            fontFamily = FontFamily(Font(R.font.montserrat_medium)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF3F486C),
                            letterSpacing = 0.4.sp,
                        )
                    )
                }

            }
        }
    }
}







