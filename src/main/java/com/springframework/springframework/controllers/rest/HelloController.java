package com.springframework.springframework.controllers.rest;

import com.springframework.springframework.features.category.Category;
import com.springframework.springframework.features.category.CategoryRepository;
import com.springframework.springframework.features.ingredient.UnitOfMeasure;
import com.springframework.springframework.features.ingredient.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public HelloController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    // Example of using `application.properties` variable
    @Value("${greeting}")
    private String greeting;

    @RequestMapping("/hello")
    public String hello() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is: " + categoryOptional.get().getId());
        System.out.println("UnitOfMeasure Id is: " + unitOfMeasureOptional.get().getId());

        return greeting;
    }
}
