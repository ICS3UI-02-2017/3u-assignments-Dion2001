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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Create city for Robot
        City kw = new City();
        
        //create robot
        RobotSE Jeffery = new RobotSE(kw, 0, 1, Direction.WEST);
        
         //create robot
        RobotSE Rob = new RobotSE(kw, 3, 3, Direction.EAST);
        
        //Put on letter R
        Rob.setLabel("R");
        
        //Put on letter J
        Jeffery.setLabel("J");
        
        //create five things
        new Thing(kw, 0, 0);
        new Thing(kw, 1, 0);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        
        //create walls
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        
        
        //move Jeffery to collect 3 of the objects
        Jeffery.move();
        Jeffery.pickThing();
        Jeffery.turnLeft();
        Jeffery.move();
        Jeffery.pickThing();
        Jeffery.turnLeft();
        Jeffery.move();
        Jeffery.pickThing();
        
        //move Rob to pick of 2 of items and meet Jeffery
        Rob.turnAround();
        Rob.move();
        Rob.turnRight();
        Rob.move();
        Rob.pickThing();
        Rob.move();
        Rob.pickThing();
        Rob.turnLeft();
        
    }
}
