package profile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is your name");
            String name = scanner.nextLine();
            
            System.out.println("How old are you");
            Integer age = scanner.nextInt();

            System.out.println("Hi " + name + "! You will turn " + (age+1) + " next year.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



