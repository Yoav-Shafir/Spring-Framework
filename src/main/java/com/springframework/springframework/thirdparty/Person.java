package com.springframework.springframework.thirdparty;

// This package contains "simple" classes that simulate third party
// jars which are not part of our source code.
public class Person {

    private String name;

    public Person() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
