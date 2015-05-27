/*
 * Copyright (C) 2015 24701
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
 * @author 24701
 */
public class Board {
    
    Place[][] gameBoard;
    /**
     * @param xDim
     * @param yDim 
     */
    public Board(int xDim, int yDim){
        gameBoard = new Place[xDim][yDim];
        for (int i = 0; i < xDim; i++){
            for (int j = 0; j < yDim; j++){
                
            }
        }
    }
    //public Place randPlace(int x, int y){
        // Put things here
    //}
}
