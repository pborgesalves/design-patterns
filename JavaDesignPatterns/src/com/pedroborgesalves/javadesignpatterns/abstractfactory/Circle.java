package com.pedroborgesalves.javadesignpatterns.abstractfactory;

public class Circle implements Shape {

   @Override
   public String draw() {
       return "Inside Circle::draw() method.";
   }
}
