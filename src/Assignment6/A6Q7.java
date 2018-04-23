/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Arrays;

/**
 *
 * @author salod8556
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a array  with numbers from 2 to 1000
        boolean prime[] = new boolean[999];
        for (int i = 0; i < 998; i++) {
            prime[i] = true;
        }

        for(int n =2; n *n <=998; n++ ) {
            if (prime[n] == true){
            for(int i =n * 2; i <999; i+=n){
                prime[i]= false;
                
           
            
        }
            
        }
    }
        for(int i=2; i <999; i++){
            if (prime[i] ==true) {
                System.out.print(i +", ");
            }
        }
            
}
    
}

