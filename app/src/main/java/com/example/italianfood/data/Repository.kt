package com.example.italianfood.data



import com.example.italianfood.R
import com.example.italianfood.model.RecipeDataClass


object Repository {
    val recipes = listOf(
        RecipeDataClass(
            id = 84,
            category = "Antipasti",
            dishTitle = "Burrata with stewed tomatoes",
            imageResId = R.drawable.burrata_with_tomatoes,
            description = "Burrata with stewed tomatoes is a delectable Italian appetizer. It features creamy burrata cheese, known for its delicate texture, served alongside slow-cooked, aromatic stewed tomatoes. The creamy richness of the burrata perfectly complements the savory sweetness of the tomatoes, creating a harmonious and indulgent flavor combination.",
            ingredients = listOf(
                "Ingredients:\n" +
                        "700 g of tomatoes (e.g., beef hearts), cut in half\n" +
                        "2 tablespoons of olive oil\n" +
                        "½ teaspoon of salt\n" +
                        "2 tablespoons of sugar\n" +
                        "2 tablespoons of water\n" +
                        "2 tablespoons of fennel seeds\n" +
                        "300g of burrata\n" +
                        "2 tablespoons of red wine vinegar\n" +
                        "2 tablespoons of olive oil\n" +
                        "2 cloves of garlic\n" +
                        "½ teaspoons of salt, a little pepper"
            ),
            instructions = listOf(
                "Cooking Process:\n" +
                        "Put the tomatoes on a baking sheet lined with baking paper, drizzle with oil, and season with salt.\n" +
                        "Bake for about 20 minutes in the upper part of the oven, preheated to 220°C. Remove and let cool.\n" +
                        "Bring the water and sugar to a boil without stirring in a small saucepan. Reduce the heat and cook for 3 minutes until bubbles form on the surface. Add the fennel seeds and simmer, stirring, until the water evaporates and the fennel seeds are dry and white. Remove the pan from the heat and continue stirring briefly. Spread the fennel seeds on a sheet of baking paper let cool.\n" +
                        "Drain the burrata, collect 3 tablespoons of liquid, and pour into a blender. Mix and season the vinegar, oil, garlic, and 2 stewed tomato halves (about 150 g).\n" +
                        "Pour the dressing onto a dish. Top with burrata and tomatoes. Sprinkle with fennel seeds."
            )

        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////


        RecipeDataClass(
            id = 85,
            category = "Antipasti",
            dishTitle = "Burrata with lemon and basil",
            imageResId = R.drawable.burrata_with_lemons,
            description = "Burrata with lemon and basil is a delightful Italian appetizer. It features creamy burrata cheese paired with the zesty brightness of fresh lemon and the aromatic freshness of basil leaves. This combination creates a harmonious contrast of flavors and textures, making it a refreshing and indulgent dish.",
            ingredients = listOf(
                "Ingredients:\n" +
                        "1 clove of garlic\n" +
                        "300 g of burrata\n" +
                        "2 tablespoons of white balsamic vinegar\n" +
                        "3 tablespoons of lemon olive oil\n" +
                        "1/4 teaspoon of salt a little pepper\n" +
                        "2 peeled lemons, cut into slices\n" +
                        "½ bunch of basil leaves\n" +
                        "a little fleur de sel"
            ),
            instructions = listOf(
                "Cooking Process:\n" +
                        " 1. Bread: Place the slices of bread on a plate.\n" +
                        "2. Toast: Toast the slices of bread for approx. 10 minutes in the upper part of the oven, preheated to 220°C. Remove and let cool. Rub the bread slices with garlic.\n" +
                        "3. Burrata: chop the burrata put it in a salad bowl. Mix vinegar and oil, season, and pour over the burrata. Garnish with lemon and basil, sprinkle with fleur de sel. Serve the burrata with toasted bread."
            )

        ),
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 11,
            category = "Pasta",
            dishTitle = "Spaghetti Carbonara",
            imageResId = R.drawable.burrata_with_lemons,
            description = "Spaghetti Carbonara is a classic Italian pasta dish. It's not suitable for vegetarians as it contains eggs, cheese, and pancetta. The dish is creamy, savory, and rich, with approximately 400450 calories per serving.",
            ingredients = listOf(
                "Ingredients (for 4 servings):\n" +
                        "400g spaghetti\n" +
                        "150g pancetta or guanciale, diced\n" +
                        "3 large eggs\n" +
                        "100g Pecorino Romano cheese, grated\n" +
                        "50g Parmesan cheese, grated\n" +
                        "2 cloves garlic, minced (optional)\n" +
                        "Salt and black pepper to taste\n" +
                        "Fresh parsley, chopped (for garnish)"
            ),
            instructions = listOf(
                "Cooking Process:\n" +
                        "Cook the spaghetti in salted boiling water until al dente. Reserve about 1/2 cup of pasta cooking water before draining.\n" +
                        "In a separate bowl, whisk together the eggs, grated Pecorino Romano, and grated Parmesan. Season with black pepper.\n" +
                        "In a pan, sauté the diced pancetta or guanciale until crispy. If desired, add minced garlic for extra flavor.\n" +
                        "Remove the pan from heat and let it cool slightly.\n" +
                        "Combine the cooked pasta with the pancetta/guanciale and mix well.\n" +
                        "Quickly pour the egg and cheese mixture over the pasta. Toss to coat the pasta evenly. If it seems dry, add a bit of reserved pasta cooking water.\n" +
                        "Serve immediately, garnished with fresh parsley and extra cheese if desired.\n" +
                        "Enjoy this creamy and indulgent Italian classic!"
            )
        ),
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RecipeDataClass(
            id = 12,
            category = "Pasta",
            dishTitle = "Fettuccine Alfredo",
            imageResId = R.drawable.pasta_fetucci_alfredo,
            description = "Fettuccine Alfredo is a classic Italian pasta dish known for its creamy, indulgent sauce. Traditional Fettuccine Alfredo is unsuitable for a vegan or dairy free diet due to its rich butter and cream based sauce. It is a creamy pasta dish featuring fettuccine noodles, butter, heavy cream, and Parmesan cheese",

            ingredients = listOf(
                "Ingredients:\n" +
                        "8 ounces (about 2 cups) of fettuccine pasta\n" +
                        "1/2 cup unsalted butter\n" +
                        "1 cup heavy cream\n" +
                        "1 1/2 cups grated Parmesan cheese\n" +
                        "Salt and pepper to taste\n" +
                        "Optional: minced garlic, parsley for garnish\n"
            ),
            instructions = listOf(
                "Cooking Process:\n" +
                        "Cook the fettuccine pasta according to package instructions until al dente, then drain.\n" +
                        "In a large skillet, melt the butter over medium heat. If desired, add minced garlic and sauté briefly for flavor.\n" +
                        "Stir in the heavy cream and bring it to a simmer.\n" +
                        "Reduce heat and gradually whisk in the grated Parmesan cheese until the sauce is smooth and thickened.\n" +
                        "Season with salt and pepper to taste.\n" +
                        "Add the cooked fettuccine to the sauce, tossing to coat the noodles thoroughly.\n" +
                        "Serve hot, garnished with parsley if desired.\n" +
                        "For visual reference, you can view an image of this dish on the provided recipe websites."
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        RecipeDataClass(
            id = 40,
            category = "Pizza",
            dishTitle = "Margherita Pizza",
            imageResId = R.drawable.pizza_margerita,
            description = "Margherita Pizza is a classic Italian pizza known for its simplicity and delicious flavors. It features a thin crust topped with fresh ingredients. There are no specific dietary restrictions for Margherita Pizza.  Margherita Pizza consists of a thin pizza crust spread with tomato sauce, fresh mozzarella cheese, fresh basil leaves, a drizzle of olive oil, and a sprinkle of salt. It's a delightful blend of flavors, with the basil providing a fresh aroma. Approximately 250300 calories per slice (depending on the thickness of the crust and the amount of cheese used). Most Margherita Pizza recipes are designed to make one 12 inch pitch typically serves 24 people.",

            ingredients = listOf(
                "Ingredients:\n" +
                        "1 pizza dough (store bought or homemade)\n" +
                        "1/2 cup tomato sauce or crushed tomatoes\n" +
                        "8 ounces fresh mozzarella cheese, sliced\n" +
                        "Fresh basil leaves\n" +
                        "Olive oil\n" +
                        "Salt"
            ),
            instructions = listOf(
                "Cooking Process:\n" +
                        "Preheat your oven to the highest temperature (usually around 500°F or 260°C).\n" +
                        "Roll out the pizza dough on a floured surface to your desired thickness.\n" +
                        "Transfer the dough to a pizza stone or a baking sheet.\n" +
                        "Spread tomato sauce evenly over the dough, leaving a border around the edges for the crust.\n" +
                        "Arrange the slices of fresh mozzarella cheese on top of the sauce.\n" +
                        "Tear the fresh basil leaves and scatter them over the pizza.\n" +
                        "Drizzle olive oil over the pizza, and sprinkle a pinch of salt.\n" +
                        "Bake in the preheated oven for about 1012 minutes or until the crust is golden and the cheese is bubbly.\n" +
                        "Remove from the oven, let it cool slightly, slice, and serve hot. Enjoy your homemade Margherita Pizza!"
            )
        ),
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






    )


}















