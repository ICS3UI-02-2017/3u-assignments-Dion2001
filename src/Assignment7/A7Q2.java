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
public class A7Q2 {
    // create a marking scheme fir marks on a test

    public static void examGrade(double m) {
        if (m < 50) {
            System.out.println("You got a 'F' grade");
        } else if (m >= 50 && m <= 59) {
            System.out.println("You got a 'D' grade");
        } else if (m >= 60 && m <= 69) {
            System.out.println("you got a 'C' grade");
        } else if (m >= 70 && m <= 79) {
            System.out.println("you got a 'B' grade");
        } else if (m >= 80) {
            System.out.println("You got a 'A' grade");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask for mark and give the grade corresponding to the mark
        System.out.println("What mark did you get? ");
        examGrade(input.nextDouble());

    }
}
