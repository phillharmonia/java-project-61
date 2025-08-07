package hexlet.code.games;

import hexlet.code.utills.ExpressionGenerator;
import hexlet.code.utills.Constants;
import hexlet.code.utills.Greeting;
import hexlet.code.utills.Messages;

import java.util.Scanner;

public class Calc {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        var userName = Greeting.greet();
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;
        while (correctAnswers < Constants.MAX_ROUNDS) {
            int a = ExpressionGenerator.generateNumber(Constants.CALC_MIN, Constants.CALC_MAX);
            int b = ExpressionGenerator.generateNumber(Constants.CALC_MIN, Constants.CALC_MAX);
            char operator = ExpressionGenerator.generateOperator();
            var question = a + " " + operator + " " + b + " ";

            Messages.printQuestion(question);
            Messages.printYourAnswer();

            int answer = scanner.nextInt();
            int correctAnswer = ExpressionGenerator.calculate(a, b, operator);
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
