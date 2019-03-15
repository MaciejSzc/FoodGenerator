package pl.maciej.MenuCreator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.maciej.MenuCreator.models.ProductForm;
import pl.maciej.MenuCreator.models.ProductServices;
import pl.maciej.MenuCreator.models.RecipeForm;
import pl.maciej.MenuCreator.models.RecipeServices;

import javax.validation.Valid;

@Controller
public class RecipeController {
    @Autowired
    RecipeServices recipeServices;

    @GetMapping("/add/recipe")
    public String recipe(Model model){

        model.addAttribute("recipe_form", new RecipeForm());

        return "addRecipe";
    }


    @PostMapping("/add/recipe")

    public String phone(@ModelAttribute("recipe_form") @Valid RecipeForm recipeForm,
                        BindingResult bindingResult,
                        Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("tekst", "Wprowadź poprawne dane");
            return "addRecipe";
        }
        recipeServices.addRecipe(recipeForm);

        return "addRecipe";

    }
}
