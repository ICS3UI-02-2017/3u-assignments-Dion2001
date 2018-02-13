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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Create city for Robot
        City kw = new City();
        
        //create robot
        RobotSE Jeffery = new RobotSE(kw, 1, 2, Direction.SOUTH);
        
        // create walls
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 1, 2, Direction.SOUTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        
        // create newspaper
        new Thing(kw, 2, 2);
        
        // Move outside of the house
        Jeffery.turnRight();
        Jeffery.move();
        Jeffery.turnLeft();
        Jeffery.move();
        Jeffery.turnLeft();
        Jeffery.move();
        
        //Pick up newspaper
        Jeffery.pickThing();
        
        //Go back to original position
        Jeffery.turnAround();
        Jeffery.move();
        Jeffery.turnRight();
        Jeffery.move();
        Jeffery.turnRight();
        Jeffery.move();
        Jeffery.turnRight();
        
       
        
    }
}
