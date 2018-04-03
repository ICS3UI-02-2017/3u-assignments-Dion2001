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
        int students = input.nextInt();
        System.out.println("How many students are in the class: ");
        
        // Collect their marks
        int sum = 0;
        System.out.println("What are the susdents marks: ");
        int sMarks = input.nextInt();
        
        int[] marks = new int[students];
        for(int i= 0; i < marks.length; i++ ){
            sum = sum + marks[i];
            
            sum  = sum / students;
        }
            
      
    }

}