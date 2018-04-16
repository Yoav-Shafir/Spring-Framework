package com.springframework.springframework.controllers;

import com.springframework.springframework.features.recipe.Recipe;
import com.springframework.springframework.features.recipe.RecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex() {

        System.out.println("Inside IndexController::getIndex()");

        Set<Recipe> recipeSet = recipeService.getRecipes();
        System.out.println("Printing recipes...");
        recipeSet.forEach(System.out::println);

        return "index";
    }
}
