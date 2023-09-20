package com.example.italianfood.presentation.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.italianfood.presentation.MainScreen
import com.example.italianfood.presentation.Screens.OneRecipeScreen

@Composable
fun NavigationComponent() {
    val navController = rememberNavController()
    val toBackScreen = { navController.popBackStack() }
    val toOneRecipeScreen =
        { id: String -> navController.navigate("${Screen.ONE_RECIPE_SCREEN.name}/$id") }
    val configuration = LocalConfiguration.current

    NavHost(
        navController = navController,
        startDestination = Screen.MAIN_USER_SCREEN.name,
    ) {
        composable(
            route = Screen.MAIN_USER_SCREEN.name
        ) {
            MainScreen(
                //configuration= Configuration(),
                //toOneRecipeScreen = toOneRecipeScreen
            )
        }
        /////////////////////////////////////////////////////////////////////////////////
        composable(
            route = "${Screen.ONE_RECIPE_SCREEN}/{id}",
            arguments = listOf(navArgument("id"){type = NavType.StringType})
        ) {
            //val id = it.arguments?.getString("id").orEmpty()
            OneRecipeScreen(
                //navController = navController
            )
        }
    }
}


enum class Screen {
    MAIN_USER_SCREEN,
    ONE_RECIPE_SCREEN,
    FAVOURITES_SCREEN
}