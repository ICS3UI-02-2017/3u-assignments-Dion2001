/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create city for Robot
        City kw = new City();
        
        //create robot
        RobotSE Jeffery = new RobotSE(kw, 3, 0, Direction.EAST);
        
        //create nine walls
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        
        //create flag
        new Thing(kw, 3, 1);
        
        //go to flag
        Jeffery.move();
        
        //pick up flag
        Jeffery.pickThing();
        
        // go to top of the mountain
        Jeffery.turnLeft();
        Jeffery.move();
        Jeffery.turnRight();
        Jeffery.move();
        Jeffery.turnLeft();
        Jeffery.move(2);
        Jeffery.turnRight();
        Jeffery.move();
        
        //Plant flag on top of mountain
        Jeffery.putThing();
        
        //go to the bottom of the mountain on the opposite side
        Jeffery.move();
        Jeffery.turnRight();
        Jeffery.move();
        Jeffery.turnLeft();
        Jeffery.move();
        Jeffery.turnRight();
        Jeffery.move(2);
        Jeffery.turnLeft();
    }
}
