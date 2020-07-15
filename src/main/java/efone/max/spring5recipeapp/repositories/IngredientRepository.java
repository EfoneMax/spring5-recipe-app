package efone.max.spring5recipeapp.repositories;

import efone.max.spring5recipeapp.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
    void deleteIngredientByRecipeIdAndId(Long recipeId, Long ingredientId);
}
