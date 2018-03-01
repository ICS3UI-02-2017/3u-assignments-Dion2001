/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author salod8556
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create city
        City kw = new City();

        //create robot
        RobotSE Ferb = new RobotSE(kw, 5, 3, Direction.EAST);


        //move to face north
        if (!Ferb.isFacingNorth()) {
            Ferb.turnLeft();
        }

        while (Ferb.getStreet() > 0) {
            Ferb.move();
        }
        Ferb.turnLeft();
        while (Ferb.getAvenue() > 0) {
            Ferb.move();
        }


    }
}
