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
public class A7Q6 {

    public static int lastDigit(int number) {
        // find the remainder when divied by 10 and put the remainder at the last digit
        int b = 0;
        for (int i = 0; i < 10; i++) {
            if (number % 10 == i) {
                b = i;
            }
        }
        // do the same thing but if the number is negative
        for (int j = 0; j > -10; j--) {
            if (number % -10 == j) {
               b = j * -1;
               

            }
        }
        return b;
    }

//        } else if (number % 10 == 1) {
//            System.out.println("The last digit of your number is 1");
//        } else if (number % 10 == 2) {
//            System.out.println("The last digit of your number is 2");
//        } else if (number % 10 == 3) {
//            System.out.println("The last digit of your number is 3");
//        } else if (number % 10 == 4) {
//            System.out.println("The last digit of your number is 4");
//        } else if (number % 10 == 5) {
//            System.out.println("The last digit of your number is 5");
//        } else if (number % 10 == 6) {
//            System.out.println("The last digit of your number is 6");
//        } else if (number % 10 == 7) {
//            System.out.println("The last digit of your number is 7");
//        } else if (number % 10 == 8) {
//            System.out.println("The last digit of your number is 8");
//        } else if (number % 10 == 9) {
//            System.out.println("The last digit of your number is 9");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to find the last number of?");
        // out put the number of the remainder
        int digit = lastDigit(input.nextInt());
        System.out.println("The last digit of your number is: " + digit);
    }
}
/**
 * @param args the command line arguments
 */
