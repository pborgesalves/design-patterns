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

/**
 * <h1>Printer Factory</h1>
 * @author pedroborgesalves
 */
public class PrinterFactory {
    
    /**
     * PrinterFactory constructor
     */
    public PrinterFactory(){
        
    }
    
    /**
     * Creates a object of a given printer name
     * @param printerName The name of the printer
     * @return String A Printer Object associated with a given name
     */
    public Printer getPrinter(String printerName){
        if(printerName == null){
            return null;
        }
        
        if(printerName.equalsIgnoreCase("Printer 1")){
            return new Printer1();
        }else if(printerName.equalsIgnoreCase("Printer 2")){
            return new Printer2();
        }
        
        return null;
    }
}
