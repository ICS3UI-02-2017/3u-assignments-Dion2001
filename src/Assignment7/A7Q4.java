/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A7Q4 {
 
    public static double compoundIntrest(double p, double r, double n){
        // calcaulate compound intrest
        double B = p * ((1+ r)* Math.pow(p, n));
        return B;
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the princible amount, the intest rate, and the number of years?");
        
    }
}
