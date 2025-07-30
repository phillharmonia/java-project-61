package hexlet.code.games;

import hexlet.code.utills.ExpressionGenerator;
import hexlet.code.utills.Greeting;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        var userName = Greeting.greet();
        Greeting.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers= 0;
        while (correctAnswers < 3) {
            int number = ExpressionGenerator.generateNumber(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            if(!answer.equals(correctAnswer)) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
            correctAnswers += 1;
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
