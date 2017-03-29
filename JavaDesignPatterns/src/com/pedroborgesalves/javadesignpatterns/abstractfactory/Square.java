package com.pedroborgesalves.javadesignpatterns.abstractfactory;

public class Square implements Shape {

   @Override
   public String draw() {
       return "Inside Square::draw() method.";
   }
}
