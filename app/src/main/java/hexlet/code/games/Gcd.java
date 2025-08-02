package hexlet.code.games;

import hexlet.code.utills.ExpressionGenerator;
import hexlet.code.utills.Constants;
import hexlet.code.utills.Greeting;
import hexlet.code.utills.Messages;

import java.util.Scanner;

public class Gcd {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        var userName = Greeting.greet();
        System.out.println("Find the greatest common divisor of given numbers. ");

        int correctAnswers = 0;
        while (correctAnswers < Constants.MAX_ROUNDS) {
            int nod = ExpressionGenerator.generateNumber(Constants.GCD_MIN_NOD, Constants.GCD_MAX_NOD);
            int a = ExpressionGenerator.generateNumber(Constants.GCD_MIN_NUMBER, Constants.GCD_MAX_NUMBER) * nod;
            int b = ExpressionGenerator.generateNumber(Constants.GCD_MIN_NUMBER, Constants.GCD_MAX_NUMBER) * nod;
            var question = a + " " + b + " ";
            Messages.printQuestion(question);
            Messages.printYourAnswer();
            int answer = scanner.nextInt();
            int correctAnswer = ExpressionGenerator.gcd(a, b);

            if (answer != correctAnswer) {
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
