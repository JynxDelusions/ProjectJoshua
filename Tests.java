//Breion Joshua
//February 28, 2024
public class Tests {

    //Storing values
    private double average;
    private int number;
    private double total;

    //Constructor
    public Tests() {
        average = 0;
        number = 0;
        total = 0;
    }

    //Adds a test score to the total and increases the number of tests
    public void addScore(double score) {
        total += score;
        number++;
    }
    //Prevents division by zero and calculates the average
    public void getAverage() {
        if (number > 0){
            average = total / number;
        } else {
            average = 0;
        }
    }
    //toString method to display the average
    public String toString() {
        if (number == 0) {
            return "No test scores entered.";
        }
    return "The average of the " + number + " test scores is: " + String.format("%.2f", average);
    }
}