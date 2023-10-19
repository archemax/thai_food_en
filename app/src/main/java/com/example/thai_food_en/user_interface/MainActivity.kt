package com.example.thai_food_en.user_interface

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import com.example.thai_food_en.user_interface.my_navigation_routes.NavigationComponent
import com.example.thai_food_en.ui.theme.ThaiFoodTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThaiFoodTheme {
                NavigationComponent()
            }
        }
    }
}

