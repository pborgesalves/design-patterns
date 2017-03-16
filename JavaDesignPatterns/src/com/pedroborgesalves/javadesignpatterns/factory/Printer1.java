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
 * <h1>Printer1 Class</h1>
 * <p>This a Printer class example</p>
 * @author pedroborgesalves
 */
public class Printer1 implements Printer{

    /**
     * This method returns the printer text of this class
     * @return String This returns the printer text
     */
    @Override
    public String getPrinter() {
        return "I'm Printer 1";
    }
    
}
