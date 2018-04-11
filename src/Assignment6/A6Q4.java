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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter the marks 
        System.out.println("Enter 10 marks: ");

        // sort the marks 
        int[] marks = new int[11];
        for (int i = 0; i < marks.length - 1; i++) {
        int numbers = input.nextInt();
        marks [i] = numbers;
            for (int j = 0; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    int numD = marks[i];
                    marks[i] = marks[j];
                    marks[j] = numD;
                }
            }
        }
        int[] arr = marks;
        System.out.println("The marks in ascending order are: ");
        
     
    }
}
