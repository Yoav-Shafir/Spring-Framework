package com.springframework.springframework.features.recipe;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipe")
    public String recipe() {
        Set<Recipe> recipeSet = recipeService.getRecipes();

        // Just printing to the console.
        System.out.println("Printing recipes...");
        recipeSet.forEach(System.out::println);

        return "recipes";
    }

    @RequestMapping("/recipe/{id}")
    public String showById(@PathVariable String id){
        Recipe recipe = recipeService.findById(new Long(id));
        System.out.print(recipe);

        return "recipe/" + id;
    }
}
