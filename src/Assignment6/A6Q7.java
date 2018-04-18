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
        int[]numbers = new int[999];
         int p =2;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = p;
            p=p+1;
            
        }
        System.out.println(Arrays.toString(numbers));
    }
    
}
