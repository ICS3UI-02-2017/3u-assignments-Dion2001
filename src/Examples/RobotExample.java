/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *Learning how to use the robots
 * @author salod8556
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City kw = new City();
        
        // put a robot in kw
        RobotSE Jeffery = new RobotSE(kw, 2, 3, Direction.EAST);
        
        // create a wall
        new Wall(kw, 2, 5, Direction.WEST);
        new Wall(kw, 2, 5, Direction.EAST);
        
        //create thing
        new Thing(kw, 2, 4);
        new Thing(kw, -4, 4);
        new Thing(kw, -5, 4);
        new Thing(kw, -6, 4);
        new Thing(kw, -7, 4);
        
        // move the robot forward 1 space
        Jeffery.move();
        
        // move the robot n number of spaces
        // Jeffery.move(2);
    
        Jeffery.turnLeft();
        
        // Put on letter J
        Jeffery.setLabel("J");
        
        //set solour of the robot
        Jeffery.setColor(Color.blue);
        
        // pick up the thing
        Jeffery.pickThing();
        
        //move thing
        Jeffery.move();
        
        //put the thing down
        Jeffery.putThing();
        Jeffery.move();
        
        //Move up
        Jeffery.move(4);
       
        
        
    }
}
