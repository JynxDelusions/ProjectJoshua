//Breion Joshua
//Computer Science II
//March 10, 2026

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
}