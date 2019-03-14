package pl.maciej.MenuCreator.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MenuServices {

    RecipeServices recipeServices;
    ProductServices productServices;



    List<ProductEntity> possibleMenus = new ArrayList<>();

    public List<ProductEntity> getPossibleMenus(){
        return possibleMenus;
    }

    public void possibleMenuGenerator(){


    }

}
