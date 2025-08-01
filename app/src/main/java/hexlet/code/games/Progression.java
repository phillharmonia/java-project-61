package hexlet.code.games;

import hexlet.code.utills.ExpressionGenerator;
import hexlet.code.utills.Greeting;
import hexlet.code.utills.Messages;

import java.util.Scanner;

public class Progression {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        var userName = Greeting.greet();
        System.out.println("What number is missing in the progression?");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int start = ExpressionGenerator.generateNumber(1, 50);
            int step = ExpressionGenerator.generateNumber(1, 10);
            int length = 10;
            int[] progression = ExpressionGenerator.generateProgression(start, step, length);
            int hiddenIndex = ExpressionGenerator.generateNumber(1, length);
            int correctValue = progression[hiddenIndex];

            StringBuilder question = new StringBuilder();
            for (int i = 0; i < progression.length; i++) {
                if (i == hiddenIndex) {
                    question.append(".. ");
                } else {
                    question.append(progression[i]).append(" ");
                }
            }
            Messages.printQuestion(question.toString());
            Messages.printYourAnswer();

            int answer = scanner.nextInt();

            if (answer != correctValue) {
                Messages.printWrongAnswer(answer, correctValue, userName);
                return;
            }
            Messages.printCorrect();
            correctAnswers += 1;
        }
        Messages.printCongratulations(userName);
        scanner.close();
    }
}
