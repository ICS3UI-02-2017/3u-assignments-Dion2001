/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Make sure the program doesn't stop

        while (true) {

            // ask for word to translate
            System.out.println("Enter Word to Translate: ");
            String oldWord = input.nextLine();

            // Sanitize word to lowercase
            oldWord = oldWord.toLowerCase();

            //look for vowels in word
            int length = oldWord.length();

            // Reconize all vowels
            for (int i = 0; i < length; i++) {
                if (oldWord.charAt(i) == 'a' || oldWord.charAt(i) == 'e' || oldWord.charAt(i) == 'i' || oldWord.charAt(i) == 'o' || oldWord.charAt(i) == 'u') {

                    // place "ub" after the first vowel
                    String firstV = oldWord.substring(0, i);
                    String endW = oldWord.substring(i);
                    System.out.println(firstV + "ub" + endW);
                    
                    //do for multiple vowels
                    
                }
            }
        }
    }
}