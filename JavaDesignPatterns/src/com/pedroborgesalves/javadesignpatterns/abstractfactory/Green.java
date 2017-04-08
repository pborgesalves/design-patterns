package com.pedroborgesalves.javadesignpatterns.abstractfactory;

public class Green implements Color {

    @Override
    public String fill() {
        return "Inside Green::fill() method.";
    }
}
