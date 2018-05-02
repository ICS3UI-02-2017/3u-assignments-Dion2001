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
public class A7Q7 {

    public static int firstDigit(int n) {
        int x = 0;
        while (n >= 10) {

            n = n / 10;
            x = n;
        }
        while (n <= -10) {
            n = n / 10;
            x = n * -1;
        }
        return x;
    }

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to find the first number of?");
        // out put the number of the remainder
        int digit = firstDigit(input.nextInt());
        System.out.println("The first digit of your number is: " + digit);
    }
}
