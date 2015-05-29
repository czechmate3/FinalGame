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
    
    Unit[][] units;
    Terrain[][] terrain;
    
    /**
     * @param xDim
     * @param yDim 
     */
    public Board(int xDim, int yDim){
        units = new Unit[xDim][yDim];
        terrain = new Terrain[xDim][yDim];
        for (int i = 0; i < xDim; i++){
            for (int j = 0; j < yDim; j++){
                
                Terrain rand = randTerrain(i, j);
                
                units[i][j] = new EmptyUnit();
                terrain[i][j] = rand;
            }
        } // Creates board with random terrain and empty units
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return A random terrain object
     */
    public static Terrain randTerrain(int x, int y){
        
        // Temporary
        // Will fix later
        Terrain ret = new Terrain((int) (Math.random() * 5));
        return ret;
    }
    
    /**
     * 
     * @param aUnit
     * @param x
     * @param y 
     * @return if location is empty
     */
    public boolean addUnit(Unit aUnit, int x, int y){
        if (!units[x][y].isEmpty || terrain[x][y].type == 4) return false;
        
        units[x][y] = aUnit;
        
        return true;
    }
    
    /**
     * 
     * @param xFrom
     * @param yFrom
     * @param xTo
     * @param yTo 
     * @return true if to and from coordinates are both empty
     */
    public boolean moveUnit(int xFrom, int yFrom, int xTo, int yTo){
        if (!units[xFrom][yFrom].isEmpty && units[xTo][yTo].isEmpty){
            units[xTo][yTo] = units[xFrom][yFrom];
            units[xFrom][yFrom] = new EmptyUnit();
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param xFrom
     * @param yFrom
     * @param xTo
     * @param yTo
     * @return true if attack is possible, else false
     */
    public boolean attack(int xFrom, int yFrom, int xTo, int yTo){
        if (!units[xTo][yTo].isEmpty && !units[xFrom][yFrom].isEmpty && 
                units[xFrom][yFrom].player != units[xTo][yTo].player){
            
            units[xTo][yTo].setHealth(units[xFrom][yFrom].attack);
            
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return Unit at (x,y)
     */
    public Unit getUnit(int x, int y){
        return units[x][y];
    }
    
    /**
     * 
     * @param x
     * @param y
     * @return Terrain at (x,y)
     */
    public Terrain getTerain(int x, int y){
        return terrain[x][y];
    }
    
}
