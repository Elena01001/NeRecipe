package ru.netology.nerecipe.data

import androidx.lifecycle.LiveData
import ru.netology.nerecipe.dto.Recipe

interface RecipeRepository {

    val data: LiveData<List<Recipe>>

    fun save(recipe: Recipe)
    fun delete(recipeId: Long)
    fun addToFavourites(recipeId: Long)
    fun search(recipeName: String)
    fun getAllRecipes()

    companion object {
        const val NEW_RECIPE_ID = 0L
    }


}