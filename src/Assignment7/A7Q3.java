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
public class A7Q3 {

    public static void factors(int f) {
        System.out.println("The factors of " + f + " are:");


        for (int i = 1; i <= f; i++) {
            if (f % i == 0) {
                System.out.println(i);
            }



        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to find factors for");
        factors(input.nextInt());

    }
}
