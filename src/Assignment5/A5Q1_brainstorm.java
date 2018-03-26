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
public class A5Q1_brainstorm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            // ask for word to translate
            System.out.println("Enter Word to Translate: ");
            String oldWord = input.nextLine();

            // Sanitize word to lowercase
            oldWord = oldWord.toLowerCase();

            //look for vowels in word
            int length = oldWord.length();

            String ub = "";
            // Reconize all vowels
            for (int i = 0; i < length; i++) {
                char[] charArray = {'a', 'e', 'i', 'o', 'u'};
//                if (oldWord.charAt(i) == 'a' || oldWord.charAt(i) == 'e' || oldWord.charAt(i) == 'i' || oldWord.charAt(i) == 'o' || oldWord.charAt(i) == 'u') {
//                    if (oldWord.charAt(i + 1) == 'a' || oldWord.charAt(i + 1) == 'e' || oldWord.charAt(i + 1) == 'i' || oldWord.charAt(i + 1) == 'o' || oldWord.charAt(i + 1) == 'u') {
                ub = ub + "ub" + oldWord.charAt(i) + oldWord.charAt(i + 1);
                i++;
                ub = ub + "ub" + oldWord.charAt(i);
                ub = ub + oldWord.charAt(i);

            }

            // place "ub" after the first vowel
            System.out.println(ub);
        }


    }
}

    

