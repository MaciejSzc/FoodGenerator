package pl.maciej.MenuCreator.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeServices {

    private List<RecipeEntity> recipeData = new ArrayList<>();

    public void addRecipe(RecipeForm recipeForm) {
        RecipeEntity recipeEntity = new RecipeEntity(recipeForm.getName(),recipeForm.getIngredients(),recipeForm.getTools(),recipeForm.getInstruction());

        recipeData.add(recipeEntity);
    }

    public List<RecipeEntity> getAllRecips() {
        return recipeData;
    }

        for(RecipeEntity nim : )


    }


