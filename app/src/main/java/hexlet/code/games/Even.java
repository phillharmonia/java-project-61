package hexlet.code.games;

import hexlet.code.utills.ExpressionGenerator;
import hexlet.code.utills.Greeting;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        var userName = Greeting.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int number = ExpressionGenerator.generateNumber(100);
            var question = number + "";
            Messages.printQuestion(question);
            Messages.printYourAnswer();

            String answer = scanner.nextLine();
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            if(!answer.equals(correctAnswer)) {
                Messages.printWrongAnswer(answer, correctAnswer, userName);
                return;
            }
            Messages.printCorrect();
            correctAnswers += 1;
        }
        Messages.printCongratulations(userName);
    }
}
