/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
      Scanner input= new Scanner(System.in);
      //create dice
       System.out.println("Enter sum of dice: ");
      int numberOfMoves= input.nextInt();
        System.out.println("You are now on square: " + numberOfMoves);
      int placement= 1;
    }
}
