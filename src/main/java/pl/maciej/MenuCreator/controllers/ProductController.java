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

import javax.validation.Valid;

@Controller
public class ProductController {

    @Autowired
    ProductServices productServices;

    @GetMapping("/add/product")
    public String phone(Model model){

        model.addAttribute("product_form", new ProductForm());

        return "addProduct";
    }


    @PostMapping("/add/product")

    public String phone(@ModelAttribute("product_form") @Valid ProductForm productForm,
                        BindingResult bindingResult,
                        Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("tekst", "Wprowadź poprawne dane");
            return "addProduct";
        }
        productServices.addProduct(productForm);

        return "addProduct";

    }




}
