package com.springframework.springframework.features.pledge;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Pledge {
    private long id;
    private String name;

    @NotNull
    @Size(min = 3, max=50)
    private String statement;

    public Pledge() {
    }

    public Pledge(long id, String name, String statement) {
        this.id = id;
        this.name = name;
        this.statement = statement;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}