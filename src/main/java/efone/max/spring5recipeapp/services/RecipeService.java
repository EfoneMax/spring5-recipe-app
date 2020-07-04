package efone.max.spring5recipeapp.services;

import efone.max.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getAllRecipes();

    Recipe findById(Long l);
}
