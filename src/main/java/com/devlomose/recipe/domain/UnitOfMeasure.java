package com.devlomose.recipe.domain;

import javax.persistence.*;

/**
 * UnitOfMeasure at: src/main/java/com/devlomose/recipe/domain
 * Created by @DevLomoSE at 10/9/21 9:32.
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne
    private Ingredient ingredient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String uom) {
        this.description = uom;
    }
}
