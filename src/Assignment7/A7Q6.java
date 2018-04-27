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
        int b=0;
        for (int i = 0; i < 10; i++) {
             if (number % 10 == i) {
           b = i;
          return b;
        }
        
        }
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
        
        int digit =lastDigit(input.nextInt());

    }
        }

    

    /**
     * @param args the command line arguments
     */
    
}
