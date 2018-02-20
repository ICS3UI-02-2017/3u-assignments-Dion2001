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

/**
 *
 * @author salod8556
 */
public class ConditionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a city
        City kw = new City();

        // create robot
        RobotSE Rob = new RobotSE(kw, 2, 1, Direction.EAST);

        //create wall
        new Wall(kw, 2, 5, Direction.EAST);
        
        //create things
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 4);

        //move untill front is not clea
        while (Rob.frontIsClear()) {
            //if front  is clear, do this
            Rob.move();
            
            //is there something to pick?
            if(Rob.canPickThing()){
                Rob.pickThing();
                
            }
        }
        // when front us not clear
        Rob.turnRight();
        
        // do you have 1 thing in your backpack
        if(Rob.countThingsInBackpack() ==1) {
            Rob.move();
    }else if(Rob.countThingsInBackpack() ==2){
        Rob.move(2);
    }else{
        Rob.turnAround();
    }
        
        

    }
}
