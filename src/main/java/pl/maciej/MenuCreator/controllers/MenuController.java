package pl.maciej.MenuCreator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.maciej.MenuCreator.models.MenuServices;
import pl.maciej.MenuCreator.models.RecipeServices;

@Controller
public class MenuController {

    @Autowired
    MenuServices menuServices;

    @GetMapping("/menu")
    public String list(Model model){
        model.addAttribute("lists", menuServices.getPossibleMenus());
        return "menu";


    }


}
