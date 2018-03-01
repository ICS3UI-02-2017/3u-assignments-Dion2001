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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner
        Scanner input= new Scanner( System.in);
        
        //ask for numbers
        System.out.println("Please enter 4 numbers on different lines");
        
        //ask for 4 numbers
        
        String one =input.nextLine();
        String two =input.nextLine();
        String three =input.nextLine();
        String four =input.nextLine();
        
        System.out.println("Your numbers were " + one + ", " + two + ", " + three + ", " + four + ".");
        
        
    }
}
