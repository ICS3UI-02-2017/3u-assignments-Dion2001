/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create robot
        City kw= new City();
        
      // create robot
        RobotSE rob= new RobotSE(kw, 4, 0, Direction.EAST);
        
      //create stair case
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        
        
        // create lights
       new Thing(kw, 4, 1);
       new Thing(kw, 3, 2);
       new Thing(kw, 2, 3);
       new Thing(kw, 1, 4);
       
       //move robot up stair case collecting all lights
       rob.move();
       rob.pickThing();
       rob.turnLeft();
       rob.move();
       rob.turnRight();
       rob.move();
       rob.pickThing();
       rob.turnLeft();
       rob.move();
       rob.turnRight();
       rob.move();
       rob.pickThing();
       rob.turnLeft();
       rob.move();
       rob.turnRight();
       rob.move();
       rob.pickThing();
       
       // go down mountain puting the lights down on every step
       rob.move();
       rob.putThing();
       rob.move();
       rob.turnRight();
       rob.move();
       rob.putThing();
       rob.turnLeft();
       rob.move();
       rob.turnRight();
       rob.move();
       rob.putThing();
       rob.turnLeft();
       rob.move();
       rob.turnRight();
       rob.move();
       rob.putThing();
       rob.turnLeft();
       rob.move();
    }
}
