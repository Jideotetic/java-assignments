package javaassignments.gradestatistics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Grades grades;

    public UserInterface(Scanner scanner, Grades grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void start() {
        try {
            while(true) {
                System.out.println("Enter a number between 1 and 100 (or -1 to exit):");
                int number = this.scanner.nextInt();

                if(this.end(number)) {
                    break;
                }

                if (this.grades.checkValidScore(number)) {
                    System.out.println("You entered: " + number);
                    this.grades.addScore(number);
                    this.grades.addPassingGradeScore(number);
                } else {
                    System.out.println("Invalid input. Please enter a valid number between 1 and 100.");
                }
            }

            this.grades.printAverage();
            this.grades.printPassingAverage();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number between 1 and 100.");
        }
    }

     public boolean end(int score) {
        return score == -1 ? true : false;
    }

}
