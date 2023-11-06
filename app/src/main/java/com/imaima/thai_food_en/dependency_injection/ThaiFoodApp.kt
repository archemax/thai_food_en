package com.imaima.thai_food_en.dependency_injection

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import dagger.hilt.android.HiltAndroidApp
import java.util.Locale


@HiltAndroidApp
class ThaiFoodApp : Application() {


    override fun onCreate() {
        super.onCreate()
        //setDefaultLocale()

    }

//    private fun setDefaultLocale() {
//        val sharedPrefs = getSharedPreferences("YourSharedPreferencesName", Context.MODE_PRIVATE)
//        val selectedLocale = sharedPrefs.getString("selected_locale", "en") // Get the saved locale
//
//        val newLocale = if (isLocaleSupported(selectedLocale)) {
//            Locale(selectedLocale!!)
//        } else {
//            Locale("en") // Use English as the default language if the selected locale is not supported
//        }
//
//        Locale.setDefault(newLocale)
//        val resources = resources
//        val configuration = Configuration(resources.configuration)
//        configuration.setLocale(newLocale)
//        resources.updateConfiguration(configuration, resources.displayMetrics)
//    }
//
//    private fun isLocaleSupported(locale: String?): Boolean {
//        val supportedLocales = setOf("en", "uk", "de", "fr", "it", "hi") // Add the supported locales here
//        return supportedLocales.contains(locale)
//    }
}





