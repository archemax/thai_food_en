package com.example.italianfood.presentation.Screens

import android.annotation.SuppressLint
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.italianfood.R
import com.example.italianfood.presentation.Screens.one_recipe_screen.OneRecipeScreenViewModel

@SuppressLint("SuspiciousIndentation")
@Composable
fun OneRecipeScreen(
    navController: NavController,
    routeId: String
) {
    val oneRecipeScreenViewModel: OneRecipeScreenViewModel = hiltViewModel()
    val id = routeId.toIntOrNull()
    if (id != null) {
        val recipe = oneRecipeScreenViewModel.getOneRecipe(id)

        /////////////////////////////////////////////////////////////////////////////////////////////////

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 0.dp, bottom = 0.dp, start = 8.dp, end = 8.dp)
                .paint(
                    painterResource(id = R.drawable.background_jpg),
                    contentScale = ContentScale.FillHeight
                ),
        )
        {

            Image(painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "arrow back",
                modifier = Modifier
                    .clickable { navController.popBackStack() }
                    .padding(top = 8.dp, bottom = 4.dp, start = 4.dp, end = 4.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                if (recipe != null)
                    Image(
                        modifier = Modifier
                            .size(250.dp)
                            .clip(RoundedCornerShape(10.dp)),
                        painter = painterResource(id = recipe.imageResId),
                        contentDescription = null,
                    )


            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                if (recipe != null)
                    Text(
                        text = "${recipe.dishTitle}",
                        maxLines = 2,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 4.dp, end = 4.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                /////////expandible descriprion of dish///////////////////////////////////////////////////////

                var showMore = remember { mutableStateOf(false) }
                val text = " ${recipe?.description}"

                Column(modifier = Modifier.padding(20.dp)) {
                    Column(modifier = Modifier
                        .animateContentSize(animationSpec = tween(100))
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        ) { showMore.value = !showMore.value }) {

                        if (showMore.value) {
                            Text(text = text, fontSize = 18.sp)
                        } else {
                            Text(
                                text = text,
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis,
                                fontSize = 18.sp
                            )
                        }
                    }
                }
//                if (recipe != null)
//                    Text(
//                        text = " ${recipe.description}",
//                        maxLines = 3,
//                        fontSize = 24.sp
//                    )
                MyDivider()
                ///////////////////////////////////////////////////////////

                if (recipe != null)
                    Text(text = "${recipe.ingredients.joinToString()}",
                        fontSize = 16.sp)
                MyDivider()
                ///////////////////////////////////////////////////////////

                if (recipe != null)
                    Text(
                        text = "${recipe.instructions.joinToString()}",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 8.dp, end = 8.dp)

                    )
                Spacer(modifier = Modifier.weight(0.5f))

                MyDivider()
                if (recipe != null)
                    Text(text = "Category: ${recipe.category}", maxLines = 2, fontSize = 12.sp)
                Spacer(modifier = Modifier.padding(8.dp))
            }
        }
    }
}


@Composable
fun MyDivider() {
    Divider(modifier = Modifier.padding(16.dp), thickness = 3.dp, color = Color.DarkGray)
}

////@Preview(showSystemUi = true)
//@Composable
//fun ShowOneRecipeScreen() {
//
//    // Create sample data for testing
//    val sampleRecipe = RecipeDataClass(
//        id = 1,
//        category = "Sample Category",
//        dishTitle = "Sample Dish Title",
//        imageResId = 1,
//        description = "description",
//        ingredients = emptyList(),
//        instructions = emptyList()
//    )
//
//    // Display your composable using the sample data
//    //OneRecipeScreen(oneRecipe = sampleRecipe)
//}