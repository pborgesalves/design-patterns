package com.pedroborgesalves.javadesignpatterns.visitor;

public interface Element {

    public void accept(Visitor visitor);
}
