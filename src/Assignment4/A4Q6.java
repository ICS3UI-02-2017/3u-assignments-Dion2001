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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner 
        Scanner input = new Scanner(System.in);
        
        //create fines per speed limits
        System.out.println("Enter the speed limit:  ");
        int limit= input.nextInt();
        System.out.println("Enter the recorded speed of the car: ");
        int speed= input.nextInt();
        int fineOne= speed;
        int fineTwo= speed;
        int fineThree= speed;
        int noFine= speed;
        
        //message for the the speed you are going
        if(noFine < limit){
        System.out.println("Congratulations, you are within the speed limit! ");
          
    } else{
            if(fineOne >= limit + 1 && fineOne <= limit + 20){
                System.out.println("You are speeding and your fine is $100! "  );
            } else{
                if( fineTwo >= limit + 21 && fineTwo <=limit +30){
                System.out.println("You are speeding and your fine is $270! " );
            }else{
                    if(fineThree >= limit + 31){
                System.out.println("You are speeding and your fine is $500!" );
                }     
}
}
}
    }
}