package com.pedroborgesalves.javadesignpatterns.singleton;

/**
 * <h1>Singleton Pattern</h1>
 * <p>
 * You may require only one object of a class, for example, when you are a
 * creating the context of an application, or a thread manageable pool, registry
 * settings, a driver to connect to the input or output console etc. More than
 * one object of that type clearly will cause inconsistency to your program.</p>
 * <p>
 * - There must be exactly one instance of a class, and it must be accessible to
 * clients from a well-known access point.</p>
 * <p>
 * When the sole instance should be extensible by sub-classing, and clients
 * should be able to use an extended instance without modifying their code.</p>
 *
 */
public class SingletonDemo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();
        //Get the only object available
        Singleton object = Singleton.getInstance();

        //show the message
        object.getMessage();
    }
}
