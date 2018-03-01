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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create scanner
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter the measurement in inches you wish to convert: ");
        
        //use varaible to store measuremetns
        double inches = input.nextDouble();
        double cm = 2.54 * inches; 
        
        // give conversion
        System.out.println(inches + " is the same as " + cm + " in centimetres");
        
        // Try again if lower then 0
        
        while(inches < 0){
            System.out.println("Please try agian...");
         inches = input.nextDouble();
         cm = 2.54 * inches; 
    }
}
}