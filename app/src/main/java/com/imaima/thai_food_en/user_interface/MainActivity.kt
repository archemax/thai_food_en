package com.imaima.thai_food_en.user_interface

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresExtension
import com.imaima.thai_food_en.user_interface.my_navigation_routes.NavigationComponent
import com.imaima.thai_food_en.ui.theme.ThaiFoodTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThaiFoodTheme {
                NavigationComponent()



//                val config = resources.configuration
//                val locale = Locale("uk")
//                Locale.setDefault(locale)
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1)
//                    config.setLocale(locale)
//                else
//                    config.locale = locale
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
//                    createConfigurationContext(config)
//                resources.updateConfiguration(config, resources.displayMetrics)

            }
        }
    }
}

