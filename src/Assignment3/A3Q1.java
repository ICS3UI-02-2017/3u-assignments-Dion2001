/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author salod8556
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();

        //create robot
        RobotSE rob = new RobotSE(kw, 0, 2, Direction.WEST);

        //create box
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        
        //go around box two times
        int numberOfMoves = 2;
        
        while(numberOfMoves > 0){
            rob.move(2);
            rob.turnLeft();
            rob.move(3);
            rob.turnLeft();
            rob.move(3);
            rob.turnLeft();
            rob.move(3);
            rob.turnLeft();
            rob.move();
            numberOfMoves = numberOfMoves -1;
        }
        
        
    }

}
