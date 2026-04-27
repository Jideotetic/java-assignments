package javaassignments.userinterface;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<String> words;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.words = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("Enter a word");
            String word = this.scanner.nextLine();

            if (this.alreadyEntered(word)) {
                break;
            }

            this.words.add(word);
        }

        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
        return this.words.contains(word);
    }
}
