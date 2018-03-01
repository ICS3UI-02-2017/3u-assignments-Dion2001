/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create city
        City kw= new City();
                
       //create robot
        RobotSE rob = new RobotSE(kw, 3, 3, Direction.SOUTH);
        
        //create walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.NORTH);
        
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        
        
        // make robot so circles around boxes
        for (int numberOfMoves =4; numberOfMoves >0; numberOfMoves--) {
            for(int loop = 3; loop >0; loop--) {
            rob.move(3);
            rob.turnLeft();

    }  
            rob.move(3);
}
}
}
