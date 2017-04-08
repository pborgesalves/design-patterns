package com.pedroborgesalves.javadesignpatterns.abstractfactory;

public class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Inside Rectangle::draw() method.";
    }
}
