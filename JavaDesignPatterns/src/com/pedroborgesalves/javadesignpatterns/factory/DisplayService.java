package com.pedroborgesalves.javadesignpatterns.factory;

/**
 *
 * @author pedroborgesalves
 */
public abstract class DisplayService {

    protected abstract XMLParser getParser();

    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }
}
