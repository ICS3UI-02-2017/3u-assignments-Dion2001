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
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            int sMarks = input.nextInt();
            int d = marks[i];
            marks[i] = d;
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < marks[i++]) {
                System.out.println("The marks from lowest to highest are:" + marks[i]);
            }

        }

    }
}
