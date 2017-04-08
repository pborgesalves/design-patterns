package com.pedroborgesalves.javadesignpatterns.abstractfactory;

public class Blue implements Color {

    @Override
    public String fill() {
        return "Inside Blue::fill() method.";
    }
}
