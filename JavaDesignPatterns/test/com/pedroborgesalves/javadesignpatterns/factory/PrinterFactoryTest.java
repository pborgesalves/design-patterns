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
package com.pedroborgesalves.javadesignpatterns.factory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * <h1>PrinterFactoryTest</h1>
 * <p>This class tests the PrinterFactory</p>
 * @author pedroborgesalves
 */
public class PrinterFactoryTest {
    
    @Test
    public void testPrinterFactory(){
        
        String printerIdentifier;
        PrinterFactory printerFactory = new PrinterFactory();
        
        Printer printer1 = printerFactory.getPrinter("Printer 1");
        printerIdentifier = printer1.getPrinter();
        assertEquals(printerIdentifier, "I'm Printer 1");
        
        Printer printer2 = printerFactory.getPrinter("Printer 2");
        printerIdentifier = printer2.getPrinter();
        assertEquals(printerIdentifier, "I'm Printer 2");
    }
}
