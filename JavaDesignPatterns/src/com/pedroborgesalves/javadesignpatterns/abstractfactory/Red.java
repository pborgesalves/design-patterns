package com.pedroborgesalves.javadesignpatterns.abstractfactory;

public class Red implements Color {

    @Override
    public String fill() {
        return "Inside Red::fill() method.";
    }
}
