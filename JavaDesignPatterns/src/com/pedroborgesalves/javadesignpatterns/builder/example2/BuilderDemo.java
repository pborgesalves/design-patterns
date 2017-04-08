package com.pedroborgesalves.javadesignpatterns.builder.example2;

/**
 * <h1>Builder Pattern</h1>
 * <p>
 * The intent of the Builder Pattern is to separate the construction of a
 * complex object from its representation, so that the same construction process
 * can create different representations. This type of separation reduces the
 * object size.</p>
 * <p>
 * - The algorithm for creating a complex object should be independent of the
 * parts that make up the object and how they’re assembled.</p>
 * <p>
 * The construction process must allow different representations for the object
 * that’s constructed.</p>
 *
 */
public class BuilderDemo {

    public static void main(String[] args) {
        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector director = new CarDirector(carBuilder);
        director.build();
        Car car = carBuilder.getCar();
        System.out.println(car);
        carBuilder = new SportsCarBuilder();
        director = new CarDirector(carBuilder);
        director.build();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}
