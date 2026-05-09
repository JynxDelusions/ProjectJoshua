//Breion Joshua
//May 9th, 2026
//Computer Science II

//Exam class extends assessment to used the defined methods to calculate scores
public class Exam extends Assessment {

//Fields to hold the number of questions and points per question
    private int numQuestions;
    private int pointsEach;

//Constructor that takes the number of questions and missed questions
    public Exam(int numQuestions, int numMissed) {
        try {
            this.numQuestions = numQuestions;
            this.pointsEach = 100 / numQuestions;
            int score = 100 - (numMissed * pointsEach);
            setScore(score);

//Exception handles division by 0 and any missed questions
    } catch (Exception e) {
        this.numQuestions = 0;
        this.pointsEach = 0;
        setScore(0);
    }
}
//Getter for the points per question
    public int getPointsEach(){
        return pointsEach;
    }

//Getter for the number of questions
    public int getNumQuestions() {
        return numQuestions;
    }
}