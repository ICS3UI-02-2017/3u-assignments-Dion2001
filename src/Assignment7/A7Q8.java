/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import static Assignment7.A7Q7.firstDigit;
import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A7Q8 {

    public static boolean allDigitOdd(int odd) {
 // check to see if there are odd numbers
        boolean digit = true;
        while (odd >= 10 || odd <= -10) {
            if (odd % 2 == 0) {
               digit = false; 
            }
            odd = odd /10;
        }
        return digit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to find the first number of?");
        // out put the number as true or false dependings on if it is all odds or if it has evens
        boolean oddNumbers = allDigitOdd(input.nextInt());
        System.out.println("There are only odd numbers: " + oddNumbers);
    }
}
