/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author salod8556
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city
        City kw = new City();

        //create robot
        RobotSE rob = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        int numberOfMoves = 2;

        while (numberOfMoves > 0) {
            while(rob.getAvenue() != 6 && rob.getAvenue() !=0) {
                rob.putThing();
                rob.move();

            }
            if (rob.isFacingEast()) {
                rob.turnRight();
                rob.move();
                rob.turnRight();
                rob.move();
            }else
            if (!rob.isFacingEast()) {
                rob.turnLeft();
                rob.move();
                rob.turnLeft();
                rob.move();
                numberOfMoves= numberOfMoves -1;
            }



        }
    }
}
