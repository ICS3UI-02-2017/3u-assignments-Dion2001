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

            String ub = "";
            int i = 0;

            // If letters starts with vowel, put ub before it
            if (oldWord.startsWith("a") || oldWord.startsWith("e") || oldWord.startsWith("i") || oldWord.startsWith("o") || oldWord.startsWith("u")) {
                ub = "ub" + oldWord.charAt(i) + ub;
                i += 1;
            }
            // recognized all vowels
            for (i = i; i < length; i++) {
                if (oldWord.charAt(i) == 'a' || oldWord.charAt(i) == 'e' || oldWord.charAt(i) == 'i' || oldWord.charAt(i) == 'o' || oldWord.charAt(i) == 'u') {
                    if (oldWord.charAt(i - 1) == 'a' || oldWord.charAt(i - 1) == 'e' || oldWord.charAt(i - 1) == 'i' || oldWord.charAt(i - 1) == 'o' || oldWord.charAt(i - 1) == 'u') {
                     // If the letter behind the vowel is a vowel, leave it as it is
                        ub = ub + oldWord.charAt(i);
                    } else {
                        // add ub before all vowels
                        ub = ub + "ub" + oldWord.charAt(i);
                    }
                } else {
                    // add letter into string if it a consonants 
                    ub = ub + oldWord.charAt(i);
                }
            }
            // place "ub" after the first vowel
            System.out.println(ub);
            break;
        }
    }
}