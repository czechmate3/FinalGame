/*
 * Copyright (C) 2015 Ben Kaeder and Erich Vrany
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package finalgame;

/**
 *
 * @author Ben Kaeder and Erich Vrany
 */
public class EmptyUnit extends Unit{
    
    public EmptyUnit(){
        
    attack = 0;
    defense = 0;
    health = 1000000000;
    moves = 0;
    range = 0;
    isEmpty = true;
        
    }
    
}
