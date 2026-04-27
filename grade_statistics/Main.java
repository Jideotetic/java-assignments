package java_assignments.grade_statistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface(new Scanner(System.in));
        userInterface.start();
    }
}
