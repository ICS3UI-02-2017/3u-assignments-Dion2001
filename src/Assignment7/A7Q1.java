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
public class A7Q1 {
    //create  pie function
    public static double circleArea(double r){
        double cArea = Math.PI* Math.pow(r, 2);
        //send back root
        return cArea;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // give area
        System.out.println("What is the radius of the circle?: ");
        double cArea = circleArea(input.nextDouble());
        System.out.println("The radius of the cirlce is " + cArea);
    }
}
