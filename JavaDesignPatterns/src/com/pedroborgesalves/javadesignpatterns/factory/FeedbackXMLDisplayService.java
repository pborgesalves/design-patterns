package com.pedroborgesalves.javadesignpatterns.factory;

/**
 *
 * @author pedroborgesalves
 */

public class FeedbackXMLDisplayService extends DisplayService{

    @Override
    public XMLParser getParser() {
        return new FeedbackXMLParser();
    }

}
