/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city
        City kw = new City();

        //create robot
        RobotSE Ferb = new RobotSE(kw, 0, 0, Direction.EAST);

        //create tower walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.WEST);

        //create castle walls
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);


        //Follow walls around castle
       
        while(true)
        if(Ferb.frontIsClear()){
            Ferb.move(2);
            Ferb.turnRight();
            Ferb.move();
            Ferb.turnLeft();
            Ferb.move();
            Ferb.turnLeft();
            Ferb.move();
            Ferb.turnRight();
            Ferb.move(2);
            Ferb.turnRight();
            
        }
            
        
    }
}
