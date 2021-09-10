package com.devlomose.recipe.domain;

import javax.persistence.*;

/**
 * Notes at: src/main/java/com/devlomose/recipe/domain
 * Created by @DevLomoSE at 9/9/21 17:50.
 */
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipieNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipie() {
        return recipe;
    }

    public void setRecipie(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipieNotes() {
        return recipieNotes;
    }

    public void setRecipieNotes(String recipieNotes) {
        this.recipieNotes = recipieNotes;
    }
}
