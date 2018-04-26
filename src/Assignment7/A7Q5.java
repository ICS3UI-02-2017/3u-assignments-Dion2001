/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A7Q5 {

    public static void chaotic(int rows) {

        //cauclaute random number of numbers per row between 1 adn 5 per row
        for (int i = 0; i < rows; i++) {
            String asts = "";
            int randomNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // take random numbers and turn the number into the number of astricks
            for (int j = 0; j < randomNum; j++) {
                asts = asts + "*";

            }
            System.out.println(asts);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for how many rows of asterisks they want
        System.out.println("How mant rows of asterisks do you want? ");
        chaotic(input.nextInt());
    }
}
