package efone.max.spring5recipeapp.services;

import efone.max.spring5recipeapp.commands.RecipeCommand;
import efone.max.spring5recipeapp.domain.Recipe;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    @Transactional
    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long l);
}