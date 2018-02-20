/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create city
        City kw = new City();
        
        //create robot
        RobotSE Rob = new RobotSE(kw, 4, 1, Direction.EAST);
        
        //create thing]
        new Thing(kw, 4, 9);
        
        // create hurdles
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 5, Direction.SOUTH);
        new Wall(kw, 4, 6, Direction.SOUTH);
        new Wall(kw, 4, 7, Direction.SOUTH);
        new Wall(kw, 4, 8, Direction.SOUTH);
        new Wall(kw, 4, 9, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 7, Direction.EAST);
        
        // Get robot to go over walls
        while(!Rob.canPickThing()){
         if(!Rob.isBesideThing(IPredicate.aWall)){
            Rob.turnRight();
         }   
         if(Rob.frontIsClear()){
            Rob.move();     
        }else{
             Rob.turnLeft();
         }
       
         
        }    
            
        }
    }

