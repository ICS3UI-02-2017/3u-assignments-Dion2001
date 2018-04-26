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
public class A7Q4 {

    public static double compoundIntrest(double p, double r, int n) {
        // calcaulate compound intrest
        double B = p * (Math.pow((1 + r), n));
        return B;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the princible amount, the intest rate, and the number of years?");
        double p = input.nextDouble();
        double r = input.nextDouble();
        int n = input.nextInt();
        double B = compoundIntrest(p, r, n);

        System.out.println("The compund intrest is: " + B);
    }
}
