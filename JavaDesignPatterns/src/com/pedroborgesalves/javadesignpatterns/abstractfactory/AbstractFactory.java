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

/**
 * <h1>Abstract Factory</h1>
 * <p>The pattern is best utilised when your system has to create multiple 
 * families of products or you want to provide a library of products without 
 * exposing the implementation details. As you'll have noticed, 
 * a key characteristic is that the pattern will decouple the concrete 
 * classes from the client. An example of an Abstract Factory in use
 * could be UI toolkits. Across Windows, Mac and Linux, UI composites 
 * such as windows, buttons and textfields are all provided in a widget API 
 * like SWT. However, the implementation of these widgets vary across platforms. 
 * You could write a platform independent client thanks 
 * to the Abstract Factory implementation. </p>
 * 
 * @author pedroborgesalves
 */
public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}