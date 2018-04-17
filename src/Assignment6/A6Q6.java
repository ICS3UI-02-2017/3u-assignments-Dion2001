/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many people are in the class:");
        int numberM = input.nextInt();
        System.out.println("Enter Marks");


        // How many marks do you want to input
        int[] classMarks = new int[numberM];
        for (int i = 0; i < classMarks.length; i++) {
            int numbers = input.nextInt();
            classMarks[i] = numbers;

        }
        for (int i = 0; i < classMarks.length - 1; i++) {
            for (int j = i + 1; j < classMarks.length; j++) {
                if (classMarks[i] > classMarks[j]) {
                    int numD = classMarks[i];
                    classMarks[i] = classMarks[j];
                    classMarks[j] = numD;
                }

            }
        }
        // Print out the lowest number
        System.out.println("The lowest mark is: " + classMarks[0]);
        // print out highest number
        System.out.println("The highest mark is: " + classMarks[numberM - 1]);
        // print average 

        int avg1 = 0;
        for (int w = 0; w < classMarks.length; w++) {
            avg1 = avg1 + classMarks[w];
        }
        System.out.println("The average is: " + avg1 / numberM);
    }
}
