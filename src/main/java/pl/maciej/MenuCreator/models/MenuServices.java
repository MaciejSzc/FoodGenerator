package pl.maciej.MenuCreator.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MenuServices {

    @Autowired
    ProductServices productServices;
    RecipeServices recipeServices;




    List<RecipeEntity> possibleMenus = new ArrayList<>();

    public List<RecipeEntity> getPossibleMenus(){
        return possibleMenus;
    }

    public void possibleMenuGenerator(){
        List<RecipeEntity> rec = recipeServices.getRecipeData();
        List<ProductEntity> pro = productServices.getProductData();

        for(RecipeEntity r : rec){
            for (String s : r.getIngredientsToList()) {
                for(ProductEntity p : pro){
                    if(s.equals(p.getName())){
                        possibleMenus.add(r);
                    }
                }

            }
        }

    }
// Jezeli wszystkie elementy w menu.getingredientsToList; zgadzaja sie z elementami w lodowce to possibleMenus.)
}
