package com.example.italianfood.presentation.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                .padding(8.dp)
        )
        {

            Image(painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "arrow back",
                modifier = Modifier
                    .clickable { navController.popBackStack() }
                    .padding(4.dp))




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
                        maxLines = 1,
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

                ///////////////////////////////////////////////////////////
                if (recipe != null)
                    Text(
                        text = " ${recipe.description}",
                        maxLines = 3,
                        fontSize = 24.sp
                    )
                MyDivider()
                ///////////////////////////////////////////////////////////

                if (recipe != null)
                    Text(text = "${recipe.ingredients.joinToString()}", fontSize = 16.sp)
                MyDivider()
                ///////////////////////////////////////////////////////////

                if (recipe != null)
                    Text(
                        text = "${recipe.instructions.joinToString()}",
                        fontSize = 16.sp
                    )
                Spacer(modifier = Modifier.weight(0.5f))

                MyDivider()
                if (recipe != null)
                    Text(text = "Category: ${recipe.category}", maxLines = 2, fontSize = 8.sp)
            }
        }
    }
}

@Composable
fun MyDivider() {
    Divider(modifier = Modifier.padding(16.dp), thickness = 4.dp)
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