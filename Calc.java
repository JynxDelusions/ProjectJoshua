//Breion Joshua
//Computer Science II
//March 10, 2026

import java.util.Scanner;

public class Calc {

    //private data fields
    private double num1;
    private double num2;

    //set methods for num1 and num2
    public void setNum1(double n1){
        num1 = n1;
    }
    public void setNum2(double n2){
        num2 = n2;
    }

    //get methods for num1 and num2
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }

     //The math methods for add, subtract, multiply and divide
    public double add(){
        return num1 + num2;
    }
    public double subtract(){
        return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
         return num1 / num2;
    }

    
    //toString method to display the values of num1 and num2
    public String toString(){
        return "Displaying private fields using toString(): \n" + "num1: " + num1 + "\nnum2: " + num2;
    }

    //Helper that determines if the input is a number or not, continuously prompts to ask for a number, and loops until the user enters a number
    public static double validNum(Scanner scan, String screen) {
        System.out.println(screen);
        while (!scan.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scan.nextLine();
            System.out.println(screen);
        }
        //Stops the second input from skipping the second re-enter prompt
        double val = scan.nextDouble();
        scan.nextLine();
        return val;
    }
}