/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Create city for Robot
        City kw = new City();
        
        //create robot
        RobotSE Jeffery = new RobotSE(kw, 0, 0, Direction.SOUTH);
        RobotSE Ferb = new RobotSE(kw, 0, 1, Direction.SOUTH);
        
        //create 3 walls
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        
        //Move Jeffery down to bottom of wall
        Jeffery.move(2);
        Jeffery.turnLeft();
        
        //Move Ferb to first stop location
        Ferb.move();
        Ferb.turnLeft();
        Ferb.move();
        Ferb.turnRight();
        Ferb.move();
        Ferb.turnRight();
        
        // Make the robots Clash at the same time
        Jeffery.move();
        Ferb.move();
    }
}
