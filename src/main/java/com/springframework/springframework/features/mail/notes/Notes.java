package com.springframework.springframework.features.mail.notes;

import com.springframework.springframework.features.mail.recipe.Recipe;

import javax.persistence.*;

@Entity
public class Notes {

    @Id

    // Will auto generate ids in a sequence - fit for MySQL.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    // Specifies that a persistent property or field should be persisted as a
    // large object to a database-supported large object type.
    @Lob
    private String recipeNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
