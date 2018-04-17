/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("How many marks would you like to enter?:" );
        int numberM = input.nextInt();
        System.out.println("Enter Marks");
       
       
       
       
       // How many marks do you want to input
       int[] marks = new int[numberM];
        for (int i = 0; i < marks.length; i++) {
           int numbers = input.nextInt();
        marks [i] = numbers;
            
        }
        // if the first number is greater then the next number, switch them
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = i+1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    int numD = marks[i];
                    marks[i] = marks[j];
                    marks[j] = numD;
                }
            }
        }
        // output marks
        
        System.out.println("The marks in ascending order are: " + Arrays.toString(marks));
        
          if(numberM % 2 ==1){
              double oddM =numberM /2 + 0.5;
              double odd = marks [(int) oddM];
              System.out.println("The median is:" + odd);
          }else{
              if(numberM % 2 == 0){
                  double evenM =numberM /2;
                  double evenM1 = evenM -1;
                  double num1 = marks[(int)evenM];
                  double num2 = marks[(int)evenM1];
                  double tot = num1 + num2;
                  double avg = tot /2;
                  System.out.println("The median is:" + avg );
              }
          }
    }
    
}
    

    
