package com.imaima.thai_food_en.dependency_injection

import android.content.Context
import com.imaima.thai_food_en.list_of_food.BigListOfFood
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ThaIFooAppModule {

    @Singleton
    @Provides
    fun provideContext (@ApplicationContext context: Context):Context {
        return context
    }


    @Provides
    fun provideThaiFoodRepository(@ApplicationContext context: Context): BigListOfFood {
        return BigListOfFood(context)
    }
}