/*
 * Copyright (C) 2017 pedroborgesalves
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.pedroborgesalves.javadesignpatterns.abstractfactory;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author pedroborgesalves
 */
public class AbstractFactoryTest {

    @Test
    public void testAbstractFactory() {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        assertEquals(shape1.draw(), "Inside Circle::draw() method.");

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        assertEquals(shape2.draw(), "Inside Rectangle::draw() method.");

        //get an object of Shape Square 
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        assertEquals(shape3.draw(), "Inside Square::draw() method.");

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        //call fill method of Red
        assertEquals(color1.fill(), "Inside Red::fill() method.");

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        assertEquals(color2.fill(), "Inside Green::fill() method.");

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        assertEquals(color3.fill(), "Inside Blue::fill() method.");
    }

}
