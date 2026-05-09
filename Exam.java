//Breion Joshua
//May 9th, 2026
//Computer Science II

public class Exam extends Assessment {


    private int numQuestions;
    private int pointsEach;


    public Exam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.pointsEach = 100 / numQuestions;
        int score = 100 - (numMissed * pointsEach);
        setScore(score);
    }


    public int getPointsEach(){
        return pointsEach;
    }

    public int getNumQuestions() {
        return numQuestions;
    }
}