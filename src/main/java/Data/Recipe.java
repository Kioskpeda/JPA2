package Data;

import java.util.List;

public class Recipe<RecipeIngredient> {

    public int recipeId;
    public String Recipename;
    List<RecipeIngredient> Ingredient;
    List<RecipeCategory> category;
}
