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
        Scanner input = new Scanner(System.in);
        //create dice
        int finalsquare = 1;
        while (finalsquare != 100) {
            System.out.println("Enter sum of dice: ");
            int numberOfMoves = input.nextInt();

            if (numberOfMoves < 2 || numberOfMoves > 12) {
                System.out.println("You Quit!");
                System.exit(numberOfMoves);
            } else {
                finalsquare = numberOfMoves + finalsquare;


                if (finalsquare == 54) {
                    finalsquare = 19;
                }
                if (finalsquare == 90) {
                    finalsquare = 48;
                }
                if (finalsquare == 99) {
                    finalsquare = 78;
                }
                if (finalsquare == 9) {
                    finalsquare = 34;
                }
                if (finalsquare == 40) {
                    finalsquare = 64;
                }
                if (finalsquare == 67) {
                    finalsquare = 86;
                }

                if (finalsquare > 100) {
                    finalsquare = finalsquare - numberOfMoves;
                }

                System.out.println("You are now on square: " + finalsquare);
                if (finalsquare == 100) {
                    System.out.println("You Win!");
                }

            }





        }
    }
}
