//Breion Joshua
//April 2, 2026
//Computer Science II

import java.util.Arrays;
import java.util.Random;

//IntArray class that contains the array data and methods to manipulate the array
public class IntArray {
    private int size;
    private int myArr[];
    private Random rand = new Random();

    //constructor that takes int argument for array length
    public IntArray(int size) {

        if(size == 0){
            this.size = 10;
        }
        else if (size == 10){
            this.size = 100;
        } else {
            this.size = size;
        }
        myArr = new int[this.size];
    }

    //Array data methods
    public int size() {
        return size;
    }

    //Fills array with random numbers between 1 and 6
    public void fillRand() {
        for (int i = 0; i < size; i++) {
            myArr[i] = rand.nextInt(6);
        }
    }

    //Sets certain array element to a new value
    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            myArr[index] = value;
        }
    }

    //Displays the value at position 5
    public int get(int index) {
        if (index >= 0 && index < size) {
            return myArr[index];
        }
        return -1; // Return -1 if index is out of bounds
    }

    //Clears the array
    public void clear() {
        myArr = new int[0];
        size = 0;
    }

    //Checks if array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    //Sorts the array
    public void sort() {
        Arrays.sort(myArr);
    }

    //toString method to display array data
    public String toString(){
        String result = "IntArray instance data:\n";

        for (int i = 0; i < size; i++) {
            result += "Element " + i + ": " + myArr[i] + "\n";
        }
        return result;
    }

}