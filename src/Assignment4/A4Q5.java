/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner
       Scanner input= new Scanner(System.in);
       
       //ask for name
        System.out.println("What is your name?: ");
        String name= input.nextLine();
        
       // Ask for what test was out of and what percentage they got
        System.out.println("What was the first test out of?: ");
        double test1 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double test1results =input.nextDouble();
        System.out.println("What was the second test out of?: ");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double test2results = input.nextDouble();
        System.out.println("What was the third test out of?: ");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double test3results =input.nextDouble();
        System.out.println("What was the fourth test out of?: ");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double test4results =input.nextDouble();
        System.out.println("What was the fifth test out of?: ");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double test5results =input.nextDouble();
        
        // test scores in percentages 
        System.out.println("Test scores for Doug: ");
        double test1score = test1results/test1;
        System.out.println("Test 1: " + test1score*100);
        double test2score = test2results/test2;
         System.out.println("Test 2: " + test2score*100);
        double test3score = test3results/test3;
         System.out.println("Test 3: " + test3score*100);
        double test4score = test4results/test4;
         System.out.println("Test 4: " + test4score*100);
          double test5score = test5results/test5;
         System.out.println("Test 5: " + test5score*100);
      
        // average for all the test
        double total = test1score + test2score + test3score + test4score + test5score;
        double average= total/5;
        System.out.println("Average: " + average); 
    }
}
