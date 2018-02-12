/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create city for Robot
        City kw = new City();
        
        //create robot
        RobotSE Jeffery = new RobotSE(kw, 0, 2, Direction.WEST);
        
        // create walls
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.SOUTH);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        
        //Move robot two squares
        Jeffery.move(2);
        
        //Turn Left 
        Jeffery.turnLeft();
        
        //Move robot 2 squares
        Jeffery.move(3);
                
        //Move left
       Jeffery.turnLeft();
       
       //Move robot 3 sqaures
       Jeffery.move(3);
       
       //Turn robot left
       Jeffery.turnLeft();
       
       //Move 3 sqaures
       Jeffery.move(3);
       
       // Turn Robot left
       Jeffery.turnLeft();
       
       // Move 1 sqaure
       Jeffery.move();
    }
}
