import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tests test = new Tests();

            System.out.println("Enter test scores (enter -1 to stop):");
            double score = input.nextDouble();

            while (score != -1) {
                test.addScore(score);
                System.out.println("Enter test scores (enter -1 to stop):");
                score = input.nextDouble();
            }

        test.getAverage();
        System.out.println(test);
        input.close();
    }
}