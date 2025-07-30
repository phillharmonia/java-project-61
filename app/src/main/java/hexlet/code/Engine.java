package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void games() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Cli.greet();
            case 2 -> Even.game();
            case 3 -> Calc.game();
            case 0 -> System.out.println("Bye!");
            default -> System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
