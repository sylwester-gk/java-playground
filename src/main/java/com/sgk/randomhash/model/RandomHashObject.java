package com.sgk.randomhash.model;

import lombok.Getter;

import java.util.Objects;
import java.util.Random;


public class RandomHashObject {
    @Getter
    private String name;

    public RandomHashObject(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomHashObject that = (RandomHashObject) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        Random random = new Random();
        int i = random.nextInt();
        return i;
    }
}
