package javaassignments.userinterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet wordSet = new WordSet();

        UserInterface userInterface = new UserInterface(scanner, wordSet);
        userInterface.start();
    }
}
