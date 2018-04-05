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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter two numbers 
        System.out.println("Enter 2 integers");


        // sort the numbers in ascending order
        int[] sort = new int[2];
        for (int i = 0; i < sort.length; i++) {
            int numbers = input.nextInt();
            sort[i] = numbers;
        }
        // make program say them in ascending order
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] < sort[i + 1]) {
                System.out.println("The integers in ascending order are:" + sort[i] + " " + sort[ i + 1]);
            } else {
                System.out.println("The integers in ascending order are:" + sort[i + 1] + " " + sort[i]);
            }
            break;
                    



        }
    }
}
