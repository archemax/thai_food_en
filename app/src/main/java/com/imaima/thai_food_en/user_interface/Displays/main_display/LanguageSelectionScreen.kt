package com.imaima.thai_food_en.user_interface.Displays.main_display

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.imaima.thai_food_en.R

import java.util.Locale


@Composable
fun LanguageSelectionScreen(
    onBackClicked: () -> Unit,
    navController: NavController
) {
    val context = LocalContext.current
    val resources = context.resources
    var selectedLocale  by remember { mutableStateOf("en") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Row() {
            Image(painter = painterResource(id = R.drawable.arrow_narrow_left),
                contentDescription = "arrow back",
                modifier = Modifier
                    .clickable { navController.popBackStack() }
                    .padding(16.dp))
            Spacer(modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.fillMaxWidth(), // This makes the row fill the entire width.
            horizontalArrangement = Arrangement.Center, // Horizontally centers its children.
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Text(
                modifier = Modifier.padding(16.dp),
                text = "Choose your language:",
                style = MaterialTheme.typography.headlineLarge
            )
        }

        val languagesList = listOf(
            "English",
            "Ukrainian",
            "French",
            "German",
        )

        Column() {
            languagesList.forEach { text ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = (text == selectedLocale),
                            onClick = {
                                selectedLocale = text

                                val newLocale = when (text) {
                                    "English" -> Locale("en")
                                    "Ukrainian" -> Locale("uk")
                                    "French" -> Locale("fr")
                                    "German" -> Locale("de")
                                    else -> Locale("en")
                                }

                                // Update the app's configuration to the new locale
                                val configuration = Configuration(context.resources.configuration)
                                configuration.setLocale(newLocale)
                                context.resources.updateConfiguration(configuration, context.resources.displayMetrics)





                            }
                        )
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                )
                {
                    RadioButton(
                        selected = (text == selectedLocale),
                        onClick = {selectedLocale = text}
                        )
                    Text(
                        text = text,
                        style = MaterialTheme.typography.headlineLarge,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

            }
        }
    }

}
