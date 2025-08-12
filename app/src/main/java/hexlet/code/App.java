package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Greeting;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Greeting.greet();
            case 2 -> Even.start();
            case 3 -> Calc.start();
            case 4 -> Gcd.start();
            case 5 -> Progression.start();
            case 6-> Prime.start();
            case 0 -> System.out.println("Bye!");
            default -> System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}