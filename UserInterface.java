package java_assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private int numberOfCourses;
    private int totalScore;
    private int totalPassingGradeScore;
    private int numberOfPassingGrades;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.numberOfCourses = 0;
        this.totalScore = 0;
        this.totalPassingGradeScore = 0;
        this.numberOfPassingGrades = 0;
    }

    public void start() {
        try {
            while(true) {
                System.out.println("Enter a number between 1 and 100 (or -1 to exit):");
                int number = this.scanner.nextInt();

                if(this.endProgram(number)) {
                    break;
                }

                if (this.validScore(number)) {
                    System.out.println("You entered: " + number);
                    this.addScore(number);
                    this.addPassingGrade(number);
                } else {
                    System.out.println("Invalid input. Please enter a valid number between 1 and 100.");
                }
            }

            this.printAverage();
            this.printPassingAverage();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number between 1 and 100.");
        }
    }

    public boolean endProgram(int score) {
        return score == -1 ? true : false;
    }

    public boolean validScore(int score) {
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

    public void addPassingGrade(int score) {
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
