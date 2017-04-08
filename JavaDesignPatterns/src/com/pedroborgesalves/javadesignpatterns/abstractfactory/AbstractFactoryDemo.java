package com.pedroborgesalves.javadesignpatterns.abstractfactory;

/**
 * <h1>Abstract Factory</h1>
 * <p>
 * The pattern is best utilised when your system has to create multiple families
 * of products or you want to provide a library of products without exposing the
 * implementation details. As you'll have noticed, a key characteristic is that
 * the pattern will decouple the concrete classes from the client. An example of
 * an Abstract Factory in use could be UI toolkits. Across Windows, Mac and
 * Linux, UI composites such as windows, buttons and textfields are all provided
 * in a widget API like SWT. However, the implementation of these widgets vary
 * across platforms. You could write a platform independent client thanks to the
 * Abstract Factory implementation.</p>
 *
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        System.out.println(shape1.draw());

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        System.out.println(shape2.draw());

        //get an object of Shape Square 
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        System.out.println(shape3.draw());

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        //call fill method of Red
        System.out.println(color1.fill());

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        System.out.println(color2.fill());

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        System.out.println(color3.fill());
    }
}
