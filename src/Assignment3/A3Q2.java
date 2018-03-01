/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author salod8556
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create city
        City kw = new City();
        
        // counters
        kw.showThingCounts(true);
        
        // create robot
        RobotSE rob= new RobotSE(kw, 1, 1, Direction.EAST);
        
        //create things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        
        // Move things to the pile on right
        int numberOfMoves = 10;
        
        while(numberOfMoves >0){
            rob.pickThing();
            rob.move();
            rob.putThing();
            rob.turnAround();
            rob.move();
            rob.turnAround();
            numberOfMoves = numberOfMoves -1;
            
        }
        
        rob.move();
    }
}
