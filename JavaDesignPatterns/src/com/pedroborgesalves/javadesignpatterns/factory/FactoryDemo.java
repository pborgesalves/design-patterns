package com.pedroborgesalves.javadesignpatterns.factory;

/**
 *
 * @author pedroborgesalves
 */


public class FactoryDemo {
    
    public static void main(String[] args) {
        
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();
        
        service = new ErrorXMLDisplayService();
        service.display();
    }
}
