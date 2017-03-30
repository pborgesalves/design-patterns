package com.pedroborgesalves.javadesignpatterns.bridge;

/**
 * <h1>Bridge Pattern</h1>
 * <p>- You want to avoid a permanent binding between an abstraction and 
 * its implementation. This might be the case, for example, when the 
 * implementation must be selected or switched at run-time.</p>
 * <p>- Both the abstractions and their implementations should be extensible 
 * by sub-classing. In this case, the Bridge pattern lets you combine the 
 * different abstractions and implementations and extend them independently.</p>
 * <p>Changes in the implementation of an abstraction should have no impact 
 * on clients; that is, their code should not have to be recompiled.</p>
 * <p>You want to share an implementation among multiple objects 
 * (perhaps using reference counting), and this fact should be hidden rom 
 * the client.</p>
 * 
 */
public class BridgeDemo {

    public static void main(String[] args) {
        Product product = new CentralLocking("Central Locking System");
        Product product2 = new GearLocking("Gear Locking System");
        Car car = new BigWheel(product, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new BigWheel(product2, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println("-------------------------------------------------");

        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(product2, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

    }

}
