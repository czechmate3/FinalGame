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
                Unit empty = new EmptyUnit();
                Terrain rand = randTerrain(i, j);
                gameBoard[i][j] = new Place(empty, rand);
            }
        }
    }
    public static Terrain randTerrain(int x, int y){
        
        // Temporary
        // Will fix later
        Terrain ret = new Plain();
        return ret;
    }
}
