package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import hexlet.code.utills.Constants;
import hexlet.code.utills.Greeting;

import java.util.Scanner;

public class Engine {
    public static void games() {
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
            case Constants.GAME_GREET -> Greeting.greet();
            case Constants.GAME_EVEN -> Even.game();
            case Constants.GAME_CALC -> Calc.game();
            case Constants.GAME_GCD -> Gcd.game();
            case Constants.GAME_PROGRESSION -> Progression.game();
            case Constants.GAME_PRIME -> Prime.game();
            case Constants.GAME_EXIT -> System.out.println("Bye!");
            default -> System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
