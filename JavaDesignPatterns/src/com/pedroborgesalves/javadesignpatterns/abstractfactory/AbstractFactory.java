package com.pedroborgesalves.javadesignpatterns.abstractfactory;

public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}