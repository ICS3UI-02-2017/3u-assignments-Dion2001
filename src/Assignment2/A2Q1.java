/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author salod8556
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // create city
        City kw = new City();
        
        // create robot
        RobotSE Ferb= new RobotSE(kw, 1, 1, Direction.EAST);
        
        // create things
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);
        
        // pick up 7 things and keep moving forwards
        while(Ferb.countThingsInBackpack() < 7){
           Ferb.move();
           Ferb.pickThing(); 
        }
            if(Ferb.countThingsInBackpack() == 7){
                Ferb.move(4);
            }
        
    
        
    }
}
