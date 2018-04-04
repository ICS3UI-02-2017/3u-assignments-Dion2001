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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        // enter the amount people you are measuring 
         System.out.println("How many peoples heights are you measuring: ");
        int people = input.nextInt();
        // Collect their marks and add them so the average can be used 
        double[] heights = new double[people];
        double sum = 0;
        System.out.println("Please enter there heights in cm's: ");
        for(int i= 0; i < heights.length; i++ ){
            double sHeights = input.nextDouble();
            heights[i] = sHeights;
            sum = sum + heights [i];
        }
        // calculate the averages
        double avg = sum / people;
            for( int i= 0; i < heights.length; i++ ){
            if(heights[i] > avg ){
                System.out.println("People above average are: " + heights[i]);
            }
            
    }
}
}