package com.example.thai_food_en.user_interface.Displays

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.imaima.thai_food_en.R

import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(
    //viewModel: SplashScreenViewModel,
    onNavigationNext: () -> Unit
) {
    LaunchedEffect(true) {
        delay(1000) // 1 second = 1000 milliseconds
        onNavigationNext.invoke()
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFDF0000)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(modifier = Modifier.size(300.dp),

        painter = painterResource(id = R.drawable.asian_logo_png,
        ),
            contentDescription = null)
//

    }
}








