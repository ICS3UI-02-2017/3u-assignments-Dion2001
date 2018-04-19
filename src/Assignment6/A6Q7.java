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
        int[] numbers = new int[999];
        int p = 2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = p;
            p = p + 1;


            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
                numbers[0] = 2;
            }
            if (numbers[i] % 3 == 0) {
                numbers[i] = 0;
                numbers[1] = 3;
            }
            if (numbers[i] % 5 == 0) {
                numbers[i] = 0;
                numbers[3] = 5;
            }
            if (numbers[i] % 7 == 0) {
                numbers[i] = 0;
                numbers[5] = 7;
            }
            if (numbers[i] % 9 == 0) {
                numbers[i] = 0;
                numbers[7] = 9;
            }
            if(numbers[i] % 11 ==0){
                numbers[i]= 0;
                numbers [9] = 11;                
            }
            if(numbers[i] %13 ==0){
                 numbers[i] = 0;
                 numbers [11] =13;
            }
        }
        


        System.out.println(Arrays.toString(numbers));
    }
}
