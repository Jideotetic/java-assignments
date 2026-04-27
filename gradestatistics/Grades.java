package javaassignments.gradestatistics;

public class Grades {
    private int numberOfCourses;
    private int totalScore;
    private int totalPassingGradeScore;
    private int numberOfPassingGrades;

    public Grades() {
        this.numberOfCourses = 0;
        this.totalScore = 0;
        this.totalPassingGradeScore = 0;
        this.numberOfPassingGrades = 0;
    }

    public boolean checkValidScore(int score) {
        return score >= 1 && score <= 100;
    }

    public void addScore(int score) {
        this.totalScore += score;
        this.numberOfCourses++;
    }

    public void printAverage() {
        if (this.numberOfCourses > 0) {
            System.out.println("Point average (all): " + this.totalScore / this.numberOfCourses);
        } else {
            System.out.println("No scores entered.");
        }
    }

    public void addPassingGradeScore(int score) {
        if (score >= 50) {
            this.totalPassingGradeScore += score;
            this.numberOfPassingGrades++;
        }
    }

    public void printPassingAverage() {
       if (this.numberOfPassingGrades > 0) {
           System.out.println("Point average (passing): " + this.totalPassingGradeScore / this.numberOfPassingGrades);
       } else {
           System.out.println("Point average (passing): -");
       }
   }
}
