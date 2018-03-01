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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // create scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        
        // make variable to store name
        String name = input.nextLine();
        
        //Greet user
        System.out.println("Hello " + name + ". How are you today?");
    }
}
