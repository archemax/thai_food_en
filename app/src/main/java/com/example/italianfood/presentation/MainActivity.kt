package com.example.italianfood.presentation

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import com.example.italianfood.presentation.navigation.NavigationComponent
import com.example.italianfood.ui.theme.ItalianFoodTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItalianFoodTheme {
                NavigationComponent()
            }
        }
    }
}

