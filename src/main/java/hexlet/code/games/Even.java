package hexlet.code.games;

import hexlet.code.utills.ExpressionGenerator;
import hexlet.code.utills.Constants;
import hexlet.code.utills.Greeting;
import hexlet.code.utills.Messages;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        var userName = Greeting.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;
        while (correctAnswers < Constants.MAX_ROUNDS) {
            int number = ExpressionGenerator.generateNumber(Constants.MIN_NUMBER, Constants.MAX_NUMBER);
            var question = number + "";
            Messages.printQuestion(question);
            Messages.printYourAnswer();

            String answer = scanner.nextLine();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
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
