package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS = 3;

    public static void run(String description, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        String user = scanner.nextLine();
        System.out.println("Hello, " + user + "!");
        System.out.println(description);
        for (int i = 0; i < ROUNDS; i++) {
            String question = rounds[i][0];
            String correctAnswer = rounds[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "' is wrong ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + user + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + user + "!");
    }
}