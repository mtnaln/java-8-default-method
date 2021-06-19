package com.metin.medium.java8defaultmethod.model;

public interface Shape {

    default void rotate() {
        System.out.println("Shape is rotating...");
    }
}
