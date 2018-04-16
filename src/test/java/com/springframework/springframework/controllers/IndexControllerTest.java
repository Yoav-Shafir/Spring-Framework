package com.springframework.springframework.controllers;

import com.springframework.springframework.features.recipe.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class IndexControllerTest {

    @Mock
    RecipeService recipeService;

    IndexController indexController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        indexController = new IndexController(recipeService);
    }

    @Test
    public void getIndex() {
        String controllerResponse = indexController.getIndex();
        assertEquals("index", controllerResponse);
        verify(recipeService, times(1)).getRecipes();
    }
}