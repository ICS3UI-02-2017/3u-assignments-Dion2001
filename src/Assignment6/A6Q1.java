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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        // Ask how many students are in the class
        
        System.out.println("How many students are in the class: ");
        int students = input.nextInt();
        // Collect their marks and add them so the average can be used 
        int[] marks = new int[students];
        double sum = 0;
        System.out.println("What are the students marks: ");
        for(int i= 0; i < marks.length; i++ ){
            double sMarks = input.nextDouble();
            sum = sum + sMarks + marks [i];
        }
        // round to the the 2 next decible places and give average
            double average= sum / students;
            double avg= Math.round(average*100)/100.0;
            System.out.println("The average is " + avg + "%");
            
            
           
      
    }

}