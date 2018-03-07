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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //create scanner
        Scanner input= new Scanner(System.in);
        // create a price for all the cost and create a number of tickets to break even
        System.out.print("How much does the food for prom cost?: ");
        double food= input.nextDouble();
        System.out.print("How much does the DJ cost?: ");
        double dj= input.nextDouble();
        System.out.print("How much does it cost to rent the hall?: ");
        double hall= input.nextDouble();
        System.out.print("How much does decorations cost? : ");
        double decor= input.nextDouble();
        System.out.print("How much does it cost for staff? : ");
        double staff= input.nextDouble();
        System.out.print("How much for miscellaneous costs? : ");
        double misc= input.nextDouble();
        double total= food + dj + hall + decor + staff + misc;
        double tickets = total / 35;
        Math.ceil(tickets);
        System.out.print("The total cost is " + total + ". You will need to sell " + tickets + " tickets to break even. ");
        
        
    }
}
