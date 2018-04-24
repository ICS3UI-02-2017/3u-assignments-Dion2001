/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author salod8556
 */
public class MethodsExample {

    // The hello world method to say hello
    public static void helloWorld(){
        System.out.println("Hello World!");
    }
    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    public static double posQuadFormula(double a, double b, double c){
        double discrim = b*b -4*a*c;
        double root = (-b + Math.sqrt(discrim))/ (2*a);
        // send back root
        return root;
        
    
    }
     public static double[] quadFormula(double a, double b, double c){
        //create array to store both roots
         double[]roots = new double[2];
         double discrim = b*b -4*a*c;
        
        roots[0] = (-b + Math.sqrt(discrim))/ (2*a);
        roots[1] = (-b - Math.sqrt(discrim))/ (2*a);
        // send back root
        return roots;
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call the helloworld method
        helloWorld();
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String user = input.nextLine();
        sayHello(user + "!");
        //calculate the +ve root of 3^2+7x + 1.5
        double pRoot = posQuadFormula(1,-5,-50);
        System.out.println("The Postive root is " + pRoot);
         
        
        double[] roots = quadFormula(1, -5, -50);
        System.out.println("The roots are " + roots[0] + " and " + roots [1]);
    }
}
