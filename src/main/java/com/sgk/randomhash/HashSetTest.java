package com.sgk.randomhash;

import com.sgk.randomhash.model.RandomHashObject;

import java.util.HashSet;

/**
 * Test what happens when we store in HashSet objects with hashCode() method
 * returning a new random number every time hashCode is called.
 */
public class HashSetTest {
    public static void main(String[] args) {
        RandomHashObject first = new RandomHashObject("first");
        RandomHashObject second = new RandomHashObject("second");
        RandomHashObject third = new RandomHashObject("third");
        RandomHashObject fourth = new RandomHashObject("fourth");
        RandomHashObject fifth = new RandomHashObject("fifth");

        HashSet<RandomHashObject> objects = new HashSet<>();
        objects.add(first);
        objects.add(second);
        objects.add(third);
        objects.add(fourth);
        objects.add(fifth);

        objects.forEach(obj -> System.out.println(obj.getName()));
        System.out.println(String.format("size: %d", objects.size()));

        System.out.println(String.format("added: %b",objects.add(fifth)));
        System.out.println(String.format("added: %b",objects.add(fourth)));
        System.out.println(String.format("size: %d", objects.size()));

    }
}
