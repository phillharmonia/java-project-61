package hexlet.code.games;

import hexlet.code.utills.ExpressionGenerator;
import hexlet.code.utills.Greeting;
import hexlet.code.utills.Messages;

import java.util.Scanner;

public class Prime {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        var userName = Greeting.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int number = ExpressionGenerator.generateNumber(1, 100);
            var question = number + "";
            Messages.printQuestion(question);
            Messages.printYourAnswer();

            String answer = scanner.nextLine();
            String correctAnswer = ExpressionGenerator.isPrime(number).equals("true") ? "yes" : "no";
            if (!answer.equals(correctAnswer)) {
                Messages.printWrongAnswer(answer, correctAnswer, userName);
                return;
            }
            Messages.printCorrect();
            correctAnswers += 1;
        }
        Messages.printCongratulations(userName);
        scanner.close();
    }
}
