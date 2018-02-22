/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author salod8556
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw= new City();
        RobotSE Ferb= new RobotSE(kw, 1, 1, Direction.EAST);
        
        //Couted while loop
        int numberOfMoves= 5;
        while(numberOfMoves > 0){
            Ferb.move();
            numberOfMoves = numberOfMoves -1;
        }
       
        Ferb.turnAround();
        
        //couting the other way
        numberOfMoves= 0;
        while(numberOfMoves < 5) {
            Ferb.move();
            numberOfMoves = numberOfMoves +1;
        }
        
        Ferb.turnAround();
        // use a for loop to move
        for(int count = 0; count <5; count++){
        Ferb.move();
    }
        
        int x= 10;
        x = x + 5; // adds 5
        x += 5;
        
        
}
}
    
